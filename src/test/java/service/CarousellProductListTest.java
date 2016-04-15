package service;

import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;
import java.util.List;

import model.carousell.CarousellProduct;
import model.carousell.CarousellQuery;
import model.carousell.CarousellRequest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import config.AppConfig;
import filter.CarousellPredicates;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class, loader = AnnotationConfigContextLoader.class)
public class CarousellProductListTest {

	private static final String CAROUSELL_LINK = "https://carousell.com/ui/iso/api"
	// + ";forwardCountry=true;forwardIP=true;localeCookies=true"
			+ ";path=/products/search/;query={query}";
	@Autowired
	private IProductListService productListService;

	@Test
	public void testCarousellProductListSize() {
		int count = 10;
		CarousellQuery query = CarousellQuery.builder().count(count).start(0).sort(CarousellQuery.sortType.recent).searchStr("sony lens").build();
		CarousellRequest request = CarousellRequest.builder().url(CAROUSELL_LINK).query(query.toJson()).build();
		assertTrue(productListService.getProductList(request).size() == count);
	}

	@Test
	public void testCarousellProductListFilter() {
		int count = 10;
		CarousellQuery query = CarousellQuery.builder().count(count).start(0).sort(CarousellQuery.sortType.recent).searchStr("sony lens").build();
		CarousellRequest request = CarousellRequest.builder().url(CAROUSELL_LINK).query(query.toJson()).build();
		@SuppressWarnings("unchecked")
		List<CarousellProduct> productList = (List<CarousellProduct>) productListService.getProductList(request);
		assertTrue(productList.stream()
			.filter(CarousellPredicates.isIncludeKeyWord("16-50"))
			.filter(CarousellPredicates.isPriceLessThan(BigDecimal.valueOf(500)))
			.count() > 0);
	}
}

package controller;

import java.util.List;

import model.Product;
import model.carousell.CarousellProduct;
import model.carousell.CarousellQuery;
import model.carousell.CarousellRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import service.IProductListService;

@RestController
public class ProductListController {

	@Autowired
	IProductListService productListService;

	@SuppressWarnings("unchecked")
	@RequestMapping(path = "/products", method = RequestMethod.GET)
	public ResponseEntity<List<? extends Product>> getProducts(@RequestParam(value = "searchStr") String searchStr) {
		CarousellQuery query = CarousellQuery.builder()
				.start(0)
				.count(10)
				.sort(CarousellQuery.sortType.recent)
				.searchStr(searchStr)
				.build();
		CarousellRequest request = CarousellRequest.builder()
				.api(CarousellRequest.api.default_api)
				.path(CarousellRequest.category.books)
				.query(query.toJson())
				.build();

		List<CarousellProduct> productList = (List<CarousellProduct>) productListService.getProductList(request);
		return new ResponseEntity<List<? extends Product>>(productList, HttpStatus.OK);
	}
}

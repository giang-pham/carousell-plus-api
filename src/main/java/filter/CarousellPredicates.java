package filter;

import java.math.BigDecimal;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import model.carousell.CarousellProduct;

public class CarousellPredicates implements ProductPredicates<CarousellProduct> {
	public static Predicate<CarousellProduct> isIncludeKeyWord(final String keyword) {
		return p -> p.getTitle().contains(keyword);
	}

	public static Predicate<CarousellProduct> isPriceLessThan(final BigDecimal price) {
		return p -> p.getPrice().compareTo(price) <= 0;
	}

	public List<CarousellProduct> filterProduct(List<CarousellProduct> employees, Predicate<CarousellProduct> predicate) {
		return employees.stream().filter(predicate).collect(Collectors.<CarousellProduct> toList());
	}
}
package filter;

import java.util.List;
import java.util.function.Predicate;

public interface ProductPredicates<T> {
	public abstract List<T> filterProduct(List<T> list, Predicate<T> predicate);
}

package service;

import java.util.List;

import model.CommonRequest;
import model.Product;

public interface IProductListConsumer<T extends Product, G extends CommonRequest> {
	public abstract List<T> consume(G request);
}

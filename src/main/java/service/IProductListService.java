package service;

import java.util.List;

import model.CommonRequest;
import model.Product;

public interface IProductListService {
	public abstract List<? extends Product> getProductList(CommonRequest request);
}

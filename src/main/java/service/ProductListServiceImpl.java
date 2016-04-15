package service;

import java.util.List;

import model.CommonRequest;
import model.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductListServiceImpl implements IProductListService {
	@Autowired
	private IProductListConsumer productListConsumer;

	public List<? extends Product> getProductList(CommonRequest request) {
		return productListConsumer.consume(request);
	}
}

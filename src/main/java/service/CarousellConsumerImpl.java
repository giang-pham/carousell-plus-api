package service;

import java.util.List;

import model.carousell.CarousellProduct;
import model.carousell.CarousellRequest;
import model.carousell.CarousellResponse;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CarousellConsumerImpl implements IProductListConsumer<CarousellProduct, CarousellRequest> {

	public List<CarousellProduct> consume(CarousellRequest request) {
		RestTemplate restTemplate = new RestTemplate();
		CarousellResponse response = restTemplate.getForObject(request.getUrl(), CarousellResponse.class, request.getPath(), request.getQuery());
		return response.getResult().getProducts();
	}

}

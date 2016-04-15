package model.carousell;

import java.util.List;

import lombok.Data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class CarousellResponseResult {
	private boolean noResult;
	private List<CarousellProduct> products;
}

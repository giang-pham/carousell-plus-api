package model.carousell;

import lombok.Data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class CarousellResponse {
	private CarousellResponseResult result;
}

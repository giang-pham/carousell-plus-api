package model.carousell;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import model.Product;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CarousellProduct extends Product {
	private String description;
	private String title;
	private BigDecimal price;
	@JsonProperty("primary_photo_url")
	private String primaryPhotoUrl;
}

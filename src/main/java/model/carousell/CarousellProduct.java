package model.carousell;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import model.Product;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CarousellProduct extends Product {
	private String id;
	private String description;
	private String title;
	@JsonProperty("likes_count")
	private int likeCount;
	private BigDecimal price;
	@JsonProperty("primary_photo_url")
	private String primaryPhotoUrl;
}

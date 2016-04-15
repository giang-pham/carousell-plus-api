package model.carousell;

import lombok.Builder;
import lombok.Data;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

@Builder
@Data
public class CarousellQuery {
	private int count;
	private int start;
	private sortType sort;
	public enum sortType {
		recent, popular
	}
	
	@JsonProperty("query")
	private String searchStr;
	
	public String toJson() {
		ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
		try {
			return ow.writeValueAsString(this);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			return "";
		}
	}
	
}

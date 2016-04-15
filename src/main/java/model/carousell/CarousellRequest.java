package model.carousell;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.Tolerate;
import model.CommonRequest;
@Builder 
@Data
public class CarousellRequest extends CommonRequest implements CarousellContstant{
	
	public enum category {
		general,
		for_her,
		for_him,
		baby_kids,
		luxury,
		pet_accessories,
		furniture_home,
		kitchen_appliances,
		vintage_antiques,
		cars_motors,
		beauty_products,
		textbooks,
		lifestyle_gadgets,
		design_craft,
		music_instruments,
		photography,
		sporting_gear,
		books,
		tickets_vouchers,
		k_wave,
		games_toys,
		preorders,
		everything_else,
		community,
		looking_for,
		gardening_plants,
		j_pop_j_culture,
		housing,
	}
	
	String path;
	String url = CAROUSELL_LINK;
	String query;
	
	public static class CarousellRequestBuilder {
		
		@Tolerate
		public CarousellRequestBuilder path(category category) {
			if(category.equals(CarousellRequest.category.general)) {
				this.path = PRODUCTS_SEARCH;
			} else {
				this.path = new StringBuilder().append(PRODUCTS_COLLECTIONS).append(category).append("/").toString();
			}
			return this;
		}
	}
}

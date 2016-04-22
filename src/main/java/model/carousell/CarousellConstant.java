package model.carousell;

import java.util.ArrayList;

public interface CarousellConstant {
	public static final String PRODUCTS_COLLECTIONS = "/products/collections/";
	public static final String PRODUCTS_SEARCH = "/products/search/";
	public static final String CAROUSELL_LINK = "https://carousell.com/ui/iso/api"
	// + ";forwardCountry=true;forwardIP=true;localeCookies=true"
			+ ";path={path};query={query}";

	public enum constantList {
		category
	}

	public static ArrayList<String> categoryList = new ArrayList<String>() {
		private static final long serialVersionUID = -7685763535287141965L;
		{
			add("general");
			add("for-her");
			add("for-him");
			add("baby-kids");
			add("luxury");
			add("pet-accessories");
			add("furniture-home");
			add("kitchen-appliances");
			add("vintage-antiques");
			add("cars-motors");
			add("beauty-products");
			add("textbooks");
			add("lifestyle-gadgets");
			add("design-craft");
			add("music-instruments");
			add("photography");
			add("sporting-gear");
			add("books");
			add("tickets-vouchers");
			add("k-wave");
			add("games-toys");
			add("preorders");
			add("everything-else");
			add("community");
			add("looking-for");
			add("gardening-plants");
			add("j-pop-j-culture");
			add("housing");
		}
	};
}

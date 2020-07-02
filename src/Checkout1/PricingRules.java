package Checkout1;

import java.util.ArrayList;

public class PricingRules {
	private ArrayList<Item> prices = new ArrayList<>();

	public PricingRules() {
		Item a = new Item("A", 50, true, 3, 130);
		prices.add(a);
		Item b = new Item("B", 30, true, 2, 45);
		prices.add(b);
		Item c = new Item("C", 20);
		prices.add(c);
		Item d = new Item("D", 15);
		prices.add(d);
	}

	public ArrayList<Item> getPrices() {
		return prices;
	}

}

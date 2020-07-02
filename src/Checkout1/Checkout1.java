package Checkout1;

import java.util.ArrayList;

public class Checkout1 {

	private int runningTotal;
	private ArrayList<Item> priceList = new ArrayList<>();

	public Checkout1() {
		PricingRules prices = new PricingRules();
		priceList = prices.getPrices();
	}

	public void scan(String item) {

		for (Item i : priceList) {
			if (i.getName().equals(item)) {
				runningTotal += i.getCost();
				i.increment();
				if (i.isOffer()) {
					updatePrice(i);
				}
			}
		}

	}

	private void updatePrice(Item i) {
		// TODO Auto-generated method stub
		if (triggerOffer(i)) {
			runningTotal -= (i.getCost() * i.getNumInInOffer());
			runningTotal += i.getOfferPrice();
		}

	}

	private boolean triggerOffer(Item i) {
		return i.getQuantity() % i.getNumInInOffer() == 0;
	}

	public Integer total() {
		// TODO Auto-generated method stub
		return runningTotal;
	}

}

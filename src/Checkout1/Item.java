package Checkout1;

public class Item {
	
	private String name;
	private int cost;
	private boolean offer;
	private int numInInOffer;
	private int offerPrice;
	private int quantity;
	
	public Item(String name, int cost) {
		this.name = name;
		this.cost = cost;
		
	}
	
	public Item(String name, int cost, boolean offer, int numInOffer, int offerPrice) {
		this.name = name;
		this.cost = cost;
		this.offer = offer;
		this.numInInOffer = numInOffer;
		this.offerPrice = offerPrice;
		
	}
	
	public void increment() {
		quantity ++;
	}

	public String getName() {
		return name;
	}

	public int getCost() {
		return cost;
	}

	public boolean isOffer() {
		return offer;
	}

	public int getNumInInOffer() {
		return numInInOffer;
	}

	public int getOfferPrice() {
		return offerPrice;
	}
	
	public int getQuantity() {
		return quantity;
	}
	

}

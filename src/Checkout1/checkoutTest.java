package Checkout1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import checkout.Checkout;

class checkoutTest {

	@Test
	void costofAEquals50() {
		Checkout1 checkout = new Checkout1();
		checkout.scan("A");
		assertEquals(50, checkout.total());
	}
	
	@Test
	void costofBEquals30() {
		Checkout1 checkout = new Checkout1();
		checkout.scan("B");
		assertEquals(30, checkout.total());
	}
	
	@Test
	void costofCEquals20() {
		Checkout1 checkout = new Checkout1();
		checkout.scan("C");
		assertEquals(20, checkout.total());
	}
	
	@Test
	void costofDEquals15() {
		Checkout1 checkout = new Checkout1();
		checkout.scan("D");
		assertEquals(15, checkout.total());
	}
	
	@Test
	void costofAAEquals100() {
		Checkout1 checkout = new Checkout1();
		checkout.scan("A");
		checkout.scan("A");
		assertEquals(100, checkout.total());
	}
	
	@Test
	void costofAABBEquals145() {
		Checkout1 checkout = new Checkout1();
		checkout.scan("A");
		checkout.scan("A");
		checkout.scan("B");
		checkout.scan("B");
		assertEquals(145, checkout.total());
	}
	
	@Test
	void costofAAAEquals130() {
		Checkout1 checkout = new Checkout1();
		checkout.scan("A");
		checkout.scan("A");
		checkout.scan("A");
		assertEquals(130, checkout.total());
	}
	
	@Test
	void costOfAAABBBEquals205() {
		Checkout checkout = new Checkout();
		checkout.scan('A');
		checkout.scan('A');
		checkout.scan('A');
		checkout.scan('B');
		checkout.scan('B');
		checkout.scan('B');
		assertEquals(205, checkout.total());
	}

}

package checkout;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CheckoutTest {

	@Test
	void costofAEquals50() {
		Checkout checkout = new Checkout();
		checkout.scan('A');
		assertEquals(50, checkout.total());
	}
	
	@Test
	void costOfBEquals30() {
		Checkout checkout = new Checkout();
		checkout.scan('B');
		assertEquals(30, checkout.total());
	}
	
	@Test
	void costOfCEquals20() {
		Checkout checkout = new Checkout();
		checkout.scan('C');
		assertEquals(20, checkout.total());
	}
	
	@Test
	void costOfBEquals15() {
		Checkout checkout = new Checkout();
		checkout.scan('D');
		assertEquals(15, checkout.total());
	}
	
	@Test
	void costOfAAAAEquals180() {
		Checkout checkout = new Checkout();
		checkout.scan('A');
		checkout.scan('A');
		checkout.scan('A');
		checkout.scan('A');
		assertEquals(180, checkout.total());
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
	
	@Test
	void costOfAAAequals130SpecialPrice() {
		Checkout checkout = new Checkout();
		checkout.scan('A');
		checkout.scan('A');
		checkout.scan('A');
		assertEquals(130, checkout.total());
	}
	
	@Test
	void costOfBBequals45SpecialPrice() {
		Checkout checkout = new Checkout();
		checkout.scan('B');
		checkout.scan('B');
		assertEquals(45, checkout.total());
	}
	
	@Test
	void costOfAAABBequals175SpecialPrice() {
		Checkout checkout = new Checkout();
		checkout.scan('A');
		checkout.scan('A');
		checkout.scan('A');
		checkout.scan('B');
		checkout.scan('B');
		assertEquals(175, checkout.total());
	}

}

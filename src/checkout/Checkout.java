package checkout;


public class Checkout {
	
	private int total;
	private int costOfA = 50;
	private int specialOn3 = 3;
	private int specialPriceOfA = 130;
	private int costOfB = 30;
	private int specialOn2 = 2;
	private int specialPriceOfB = 45;
	private int costOfC = 20;
	private int costOfD = 15;
	private int numOfA;
	private int numOfB;

	
	public Checkout() {
	}

	public void scan(char item) {
		// TODO Auto-generated method stub
		if(item == 'A') {
			total += costOfA;
			numOfA ++;
		}
		else if(item == 'B') {
			total += costOfB;
			numOfB ++;
		}
		else if(item == 'C') {
			total += costOfC;
		}
		else if(item == 'D') {
			total += costOfD;
		}
		
	}

	public int total() {
		// TODO Auto-generated method stub
		if(noSpecials()) {
			return total;
		}
		if (onlySpecialsOnA()) {
			total -= numOfA * costOfA;
			total += specialPriceOfA * (numOfA / specialOn3);
			//return total;
		}
		if (onlySpecialsOnB()) {
			total -= numOfB * costOfB;
			total += specialPriceOfB * (numOfB / specialOn2);
			//return total;
		}
		if (specialsAndStandardOnA()) {
			total -= numOfA * costOfA;
			total += specialPriceOfA * (numOfA / specialOn3);
			total += (numOfA % specialOn3) * costOfA;
			//return total;
		}
		if (specialsAndStandardOnB()) {
			total -= numOfB * costOfB;
			total += specialPriceOfB * (numOfB / specialOn2);
			total += (numOfB % specialOn2) * costOfB;
			//return total;
		}
		return total;
	}

	private boolean specialsAndStandardOnB() {
		return numOfB % specialOn2 > 0;
	}

	private boolean specialsAndStandardOnA() {
		return numOfA % specialOn3 > 0;
	}

	private boolean onlySpecialsOnB() {
		return numOfB % specialOn2 == 0;
	}

	private boolean onlySpecialsOnA() {
		return numOfA % specialOn3 == 0;
	}

	private boolean noSpecials() {
		return numOfA < specialOn3 && numOfB < specialOn2;
	}

}

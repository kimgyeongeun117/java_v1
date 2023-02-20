package ch04;

public class GenericBeverage <T>{
	
	private Beverage beverage;

	public Beverage getBeverage() {
		return beverage;
	}

	public void setBeverage(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String toString() {
		return super.toString();
	}
}

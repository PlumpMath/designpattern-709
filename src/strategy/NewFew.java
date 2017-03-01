package strategy;

public class NewFew implements Strategy {

	@Override
	public double getPrice(double originalPrice) {
		return originalPrice;
	}

}

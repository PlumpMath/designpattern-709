package strategy;

public class NewMany implements Strategy {

	@Override
	public double getPrice(double originalPrice) {
		return originalPrice*0.9;
	}

}

package strategy;

public class OldFew implements Strategy {

	@Override
	public double getPrice(double originalPrice) {
		return originalPrice*0.8;
	}

}

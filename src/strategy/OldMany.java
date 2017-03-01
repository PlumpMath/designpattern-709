package strategy;

public class OldMany implements Strategy {

	@Override
	public double getPrice(double originalPrice) {
		return originalPrice*0.7;
	}

}

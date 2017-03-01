package strategy;

public class Context {
	private Strategy strategy;
	
	public void setStartegy(Strategy strategy){
		this.strategy = strategy;
	}
	
	public void printPrice(double price){
		System.out.println(strategy.getPrice(price));
	}
}

package decorator;

//ConcreteDecorator:具体装饰类，起到给Component添加职责的功能。
public class WaterCar extends SuperCar {

	public WaterCar(ICar car) {
		super(car);
	}
	
	private void swim(){
		System.out.println("swim....");
	}

	@Override
	public void move() {
		super.move();
		swim();
	}
}

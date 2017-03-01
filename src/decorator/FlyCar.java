package decorator;

//ConcreteDecorator:具体装饰类，起到给Component添加职责的功能。
public class FlyCar extends SuperCar {

	public FlyCar(ICar car) {
		super(car);
	}
	
	private void fly(){
		System.out.println("fly....");
	}

	@Override
	public void move() {
		super.move();
		fly();
	}
}

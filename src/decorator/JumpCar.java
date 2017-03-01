package decorator;

//ConcreteDecorator:具体装饰类，起到给Component添加职责的功能。
public class JumpCar extends SuperCar {

	public JumpCar(ICar car) {
		super(car);
	}
	
	private void jump(){
		System.out.println("jump....");
	}

	@Override
	public void move() {
		super.move();
		jump();
	}
}

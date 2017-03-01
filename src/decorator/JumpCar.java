package decorator;

//ConcreteDecorator:����װ���࣬�𵽸�Component���ְ��Ĺ��ܡ�
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

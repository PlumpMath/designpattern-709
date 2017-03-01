package decorator;

//ConcreteDecorator:����װ���࣬�𵽸�Component���ְ��Ĺ��ܡ�
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

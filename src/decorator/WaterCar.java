package decorator;

//ConcreteDecorator:����װ���࣬�𵽸�Component���ְ��Ĺ��ܡ�
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

package decorator;

//Decorator: ����װ���ࡣ��װ�γ����࣬�̳���Component,����������չComponent��Ĺ��ܣ�������Component��˵��������֪��Decorator���ڵġ�
public class SuperCar implements ICar {
	private ICar car;
		
	public SuperCar(ICar car) {
		super();
		this.car = car;
	}
	
	@Override
	public void move() {
		car.move();
	}

}

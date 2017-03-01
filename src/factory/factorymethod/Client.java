package factory.factorymethod;

public class Client {

	public static void main(String[] args) {
		//��Ʒ����ʱ��Ҫ���Ӳ�Ʒ�Ͳ�Ʒ��Ӧ�Ĺ���
		CarFactory factory1 = new BYDCarFactory();
		Car car1 = factory1.CreateCar();
		car1.run();
		
		CarFactory factory2 = new RedFlagCarFactory();
		Car car2 = factory2.CreateCar();
		car2.run();
	}

}

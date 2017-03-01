package factory.factorymethod;

public class Client {

	public static void main(String[] args) {
		//产品增加时需要增加产品和产品对应的工厂
		CarFactory factory1 = new BYDCarFactory();
		Car car1 = factory1.CreateCar();
		car1.run();
		
		CarFactory factory2 = new RedFlagCarFactory();
		Car car2 = factory2.CreateCar();
		car2.run();
	}

}

package factory.simplefactory;

import factory.factorymethod.Car;

public class Client {

	public static void main(String[] args) {
		Car bydCar = CarFactory.getCar("BYD");
		bydCar.run();
		
		Car RedFlagCar = CarFactory.getCar("RedFlag");
		RedFlagCar.run();
	}

}

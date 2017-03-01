package factory.simplefactory;

import factory.factorymethod.Car;

public class RedFlag implements Car {

	@Override
	public void run() {
		System.out.println("RedFlag run...");
	}

}

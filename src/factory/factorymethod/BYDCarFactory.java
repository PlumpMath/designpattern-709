package factory.factorymethod;

public class BYDCarFactory implements CarFactory {

	@Override
	public Car CreateCar() {
		return new RedFlag();
	}

}

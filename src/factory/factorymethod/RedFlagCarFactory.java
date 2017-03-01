package factory.factorymethod;

public class RedFlagCarFactory implements CarFactory {

	@Override
	public Car CreateCar() {
		return new BYD();
	}

}

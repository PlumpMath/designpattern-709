package factory.abstractfactory;

public class DellComputerFactory implements ComputerFactory {

	@Override
	public Disk createDisk() {
		return new OneTDisk();
	}

	@Override
	public Memory createMemory() {
		return new EightMemory();
	}

}

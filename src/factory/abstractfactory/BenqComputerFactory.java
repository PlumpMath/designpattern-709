package factory.abstractfactory;

public class BenqComputerFactory implements ComputerFactory {

	@Override
	public Disk createDisk() {
		return new FHGDisk();
	}

	@Override
	public Memory createMemory() {
		return new FourGMemory();
	}

}

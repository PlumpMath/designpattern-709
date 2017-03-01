package factory.abstractfactory;

public class Client {

	public static void main(String[] args) {
		//不关注实际创建的是哪种产品,如何创建.只需要知道产品对应的工厂
		//添加单个产品时比较复杂
		//添加产品组时只需要添加一个工厂,如神舟电脑使用4G内存和1T硬盘的组合
		ComputerFactory factory = new DellComputerFactory();
		Disk disk = factory.createDisk();
		disk.readFile();
	}
}

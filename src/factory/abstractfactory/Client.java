package factory.abstractfactory;

public class Client {

	public static void main(String[] args) {
		//����עʵ�ʴ����������ֲ�Ʒ,��δ���.ֻ��Ҫ֪����Ʒ��Ӧ�Ĺ���
		//��ӵ�����Ʒʱ�Ƚϸ���
		//��Ӳ�Ʒ��ʱֻ��Ҫ���һ������,�����۵���ʹ��4G�ڴ��1TӲ�̵����
		ComputerFactory factory = new DellComputerFactory();
		Disk disk = factory.createDisk();
		disk.readFile();
	}
}

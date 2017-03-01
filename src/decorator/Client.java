package decorator;

public class Client {

	public static void main(String[] args) {
		// ����ͨ��һ�ֶ�̬�ķ�ʽ����չһ������Ĺ��ܣ�������ʱѡ��ͬ��װ�������Ӷ�ʵ�ֲ�ͬ����Ϊ

		ICar car = new Car();
		car = new FlyCar(car);//��ӷɵĹ���
		car.move();
		System.out.println("********************************");
		ICar car1 = new Car();
		car1 = new FlyCar(car);//��ӷɵĹ���
		car1 = new WaterCar(car);//���ˮ���εĹ���
		car1.move();
		System.out.println("********************************");
		ICar car2 = new Car();
		car2 = new WaterCar(car);//���ˮ���εĹ���
		car2 = new JumpCar(car);//������Ĺ���
		car2.move();
	}

}

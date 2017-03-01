package decorator;

public class Client {

	public static void main(String[] args) {
		// 可以通过一种动态的方式来扩展一个对象的功能，在运行时选择不同的装饰器，从而实现不同的行为

		ICar car = new Car();
		car = new FlyCar(car);//添加飞的功能
		car.move();
		System.out.println("********************************");
		ICar car1 = new Car();
		car1 = new FlyCar(car);//添加飞的功能
		car1 = new WaterCar(car);//添加水里游的功能
		car1.move();
		System.out.println("********************************");
		ICar car2 = new Car();
		car2 = new WaterCar(car);//添加水里游的功能
		car2 = new JumpCar(car);//添加跳的功能
		car2.move();
	}

}

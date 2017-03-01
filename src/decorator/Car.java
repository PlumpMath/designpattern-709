package decorator;

//ConcreteComponent:具体构件。是定义了一个具体的对象，也可以给这个对象添加一些职责。
public class Car implements ICar {

	@Override
	public void move() {
		System.out.println("陆地上move");
	}

}

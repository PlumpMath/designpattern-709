package decorator;

//ConcreteComponent:���幹�����Ƕ�����һ������Ķ���Ҳ���Ը�����������һЩְ��
public class Car implements ICar {

	@Override
	public void move() {
		System.out.println("½����move");
	}

}

package observer2;

import java.util.Observer;

public class Client {

	public static void main(String[] args) {
		// ʹ��jdk�Դ��Ĺ۲���
		ConcreteSubject subject = new ConcreteSubject();
		Observer o1 = new ConcreteObserver();
		Observer o2 = new ConcreteObserver();
		Observer o3 = new ConcreteObserver();
		
		subject.addObserver(o1);
		subject.addObserver(o2);
		subject.addObserver(o3);
		
		subject.setState(300);
		System.out.println("##################");
		subject.setState(100);
	}

}

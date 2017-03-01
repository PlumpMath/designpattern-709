package observer;

public class Client {

	public static void main(String[] args) {
		// 观察者模式定义了对象之间的一对多依赖关系，这样一来，当一个对象改变状态时，它的所有依赖者都会收到通知并且自动更新
		ConcreteSubject subject = new ConcreteSubject();
		Observer o1 = new ConcreteObserver();
		Observer o2 = new ConcreteObserver();
		Observer o3 = new ConcreteObserver();
		
		subject.registerObserver(o1);
		subject.registerObserver(o2);
		subject.registerObserver(o3);
		
		subject.setState(300);
		System.out.println("##################");
		subject.setState(100);
	}

}

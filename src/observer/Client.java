package observer;

public class Client {

	public static void main(String[] args) {
		// �۲���ģʽ�����˶���֮���һ�Զ�������ϵ������һ������һ������ı�״̬ʱ���������������߶����յ�֪ͨ�����Զ�����
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

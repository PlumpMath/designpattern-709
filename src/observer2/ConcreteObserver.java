package observer2;

import java.util.Observable;
import java.util.Observer;

///ConcreteObserver:����۲��ߡ�ʵ�ֳ���۲��߽�ɫ��Ҫ��ĸ��½ӿڣ��Ա�ʹ�����״̬������״̬��Э����
public class ConcreteObserver implements Observer {
	
	private int state;
	
	@Override
	public void update(Observable o, Object arg) {
		this.state = ((ConcreteSubject)o).getState();
		System.out.println("state change to:"+state);
	}

}

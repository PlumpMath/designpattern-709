package observer2;

import java.util.Observable;
import java.util.Observer;

///ConcreteObserver:具体观察者。实现抽象观察者角色所要求的更新接口，以便使本身的状态与主题状态相协调。
public class ConcreteObserver implements Observer {
	
	private int state;
	
	@Override
	public void update(Observable o, Object arg) {
		this.state = ((ConcreteSubject)o).getState();
		System.out.println("state change to:"+state);
	}

}

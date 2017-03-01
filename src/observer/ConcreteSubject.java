package observer;

import java.util.ArrayList;
import java.util.List;

//ConcreteSubject：具体主题。将有关状态存入具体观察者对象。在具体主题发生改变时，给所有的观察者发出通知。
public class ConcreteSubject implements Subject {
	private List<Observer> observers = new ArrayList<Observer>();
	private int state;
	
	
	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		this.notifyAllObservers();
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}
	
	@Override
	public void notifyAllObservers() {
		for(Observer o:observers){
			o.update(this.state);
		}
	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);
	}

}

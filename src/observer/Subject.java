package observer;

//Subject 定义了对所有的观察者的操作
public interface Subject {
	void registerObserver(Observer o);
	void removeObserver(Observer o);
	void notifyAllObservers();
}

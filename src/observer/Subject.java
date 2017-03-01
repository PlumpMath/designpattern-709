package observer;

//Subject �����˶����еĹ۲��ߵĲ���
public interface Subject {
	void registerObserver(Observer o);
	void removeObserver(Observer o);
	void notifyAllObservers();
}

package observer;

//Observer：观察者。为所有的具体观察者定义一个接口，在得到主题的通知时能够及时的更新自己。
public interface Observer {
	void update(int state);
}

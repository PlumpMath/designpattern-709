package observer;

///ConcreteObserver:����۲��ߡ�ʵ�ֳ���۲��߽�ɫ��Ҫ��ĸ��½ӿڣ��Ա�ʹ�����״̬������״̬��Э����
public class ConcreteObserver implements Observer {
	
	private int state;
	
	@Override
	public void update(int state) {
		this.state = state;
		System.out.println("state change to:"+state);
	}

}

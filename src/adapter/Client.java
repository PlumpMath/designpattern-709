package adapter;

public class Client {

	public static void main(String[] args) {
		//ͨ��Adapter��ʵ�ֶ�Adaptee������
		Target t = new Adapter(new Adaptee());
		t.handleReq();
	}

}

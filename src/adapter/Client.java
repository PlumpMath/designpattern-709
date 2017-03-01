package adapter;

public class Client {

	public static void main(String[] args) {
		//通过Adapter类实现对Adaptee的适配
		Target t = new Adapter(new Adaptee());
		t.handleReq();
	}

}

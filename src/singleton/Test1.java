package singleton;

public class Test1 {

	public static void main(String[] args) {
		//��������ʽ���̲߳���ȫ
		Thread t1 = new Thread(new TestThread(),"test1");
		Thread t2 = new Thread(new TestThread(),"test2");
		t1.start();
		t2.start();
	}

}

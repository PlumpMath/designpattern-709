package singleton;

public class Test1 {

	public static void main(String[] args) {
		//测试懒汉式的线程不安全
		Thread t1 = new Thread(new TestThread(),"test1");
		Thread t2 = new Thread(new TestThread(),"test2");
		t1.start();
		t2.start();
	}

}

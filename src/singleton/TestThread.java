package singleton;

/**
 * 懒汉式线程不安全测试
 * @author zcl13993
 *
 */
public class TestThread implements Runnable {
	@Override
	public void run() {
		try {
			System.out.println(Thread.currentThread().getName() + ":" + Singleton1.getInstance());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

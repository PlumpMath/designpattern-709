package singleton;

/**
 * ����ʽ�̲߳���ȫ����
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

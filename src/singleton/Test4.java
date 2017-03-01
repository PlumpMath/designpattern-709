package singleton;

import java.util.concurrent.CountDownLatch;

public class Test4 {
	
	public static void main(String[] args) throws Exception {
		//测试各种单例方式的效率
		long start = System.currentTimeMillis();
		int num = 10;
		CountDownLatch countDownLatch = new CountDownLatch(num);
		
		for(int i=0;i<num;i++){
			new Thread(new Runnable(){

				@Override
				public void run() {
					for(int j=0;j<100000000;j++){
						//Object o = Singleton4.getInstance();
						Object o = Singleton5.INSTANCE;
					}
					countDownLatch.countDown();
				}
				
			}).start();
		}
		countDownLatch.await();
		long end = System.currentTimeMillis();
		System.out.println("timespent->"+(end-start));
	}

}

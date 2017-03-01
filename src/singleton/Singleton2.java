package singleton;

/**
 * 饿汉式,加载类的时候就创建
 * @author zcl13993
 *
 */
public class Singleton2 {
	
	private static Singleton2 instance = new Singleton2();
	
	private Singleton2(){}
	
	public static Singleton2 getInstance(){
		return instance;
	}
}

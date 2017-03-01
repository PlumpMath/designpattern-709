package singleton;

/**
 * 懒汉式,请求实例的时候才去创建该单例对象
 *
 */
public class Singleton1 {
		
	private static Singleton1 instance = null;
	
	private Singleton1(){}
	
	public static Singleton1 getInstance(){
		if(null==instance){
			instance = new Singleton1();
		}
		return instance;
	}
}

package singleton;

import java.io.Serializable;

/**
 * 懒汉式,请求实例的时候才去创建该单例对象
 * @author zcl13993
 *
 */
public class Singleton6 implements Serializable {
		
	private static Singleton6 instance = null;
	
	private Singleton6(){}
	
	public static Singleton6 getInstance(){
		if(null==instance){
			instance = new Singleton6();
		}
		return instance;
	}
	
	//序列化操作提供了一个很特别的钩子（hook）-类中具有一个私有的被实例化的方法readresolve(),
	//这个方法可以确保类的开发人员在序列化将会返回怎样的object上具有发言权
//	private Object readResolve(){
//		return instance;
//	}
	
}

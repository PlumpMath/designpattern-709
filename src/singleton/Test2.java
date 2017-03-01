package singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class Test2 {
	
	public static void main(String[] args) throws Exception {
		//通过反射创建饿汉式的多个实例
		Class<Singleton2> clazz = Singleton2.class;
		Constructor[] c = clazz.getDeclaredConstructors();
		c[0].setAccessible(true);
		Singleton2 s2 = (Singleton2)c[0].newInstance(new Object[]{});
		System.out.println(Singleton2.getInstance());
		System.out.println(s2);
	}

}

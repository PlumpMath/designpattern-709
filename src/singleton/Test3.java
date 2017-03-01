package singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class Test3 {
	
	public static void main(String[] args) throws Exception {
		//通过序列化和反序列化来实现单例的破解
		//序列化
		FileOutputStream fos = new FileOutputStream("d:/test.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		fos.flush();
		oos.writeObject(Singleton6.getInstance());
		//try...catch..关闭流...
		
		//反序列化
		FileInputStream fis = new FileInputStream("d:/test.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Singleton6 instance2 = (Singleton6)ois.readObject();
		
		System.out.println("判断是否是Singleton6的实例:"+(instance2 instanceof Singleton6));
	}

}

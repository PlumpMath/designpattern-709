package singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class Test3 {
	
	public static void main(String[] args) throws Exception {
		//ͨ�����л��ͷ����л���ʵ�ֵ������ƽ�
		//���л�
		FileOutputStream fos = new FileOutputStream("d:/test.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		fos.flush();
		oos.writeObject(Singleton6.getInstance());
		//try...catch..�ر���...
		
		//�����л�
		FileInputStream fis = new FileInputStream("d:/test.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Singleton6 instance2 = (Singleton6)ois.readObject();
		
		System.out.println("�ж��Ƿ���Singleton6��ʵ��:"+(instance2 instanceof Singleton6));
	}

}

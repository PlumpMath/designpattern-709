package prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class Client3 {

	public static void main(String[] args) throws Exception {
		//浅拷贝,对于引用类型仅拷贝了地址.如date类型
		//要想实现深度拷贝可以通过
		//1.在clone方法中对引用类型也进行调用clone()方法
		//2.通过序列化和反序列化
		Date d = new Date(12312424L);
		Student s1 = new Student("tom", d);

		//转换流 InputStreamReader OutputStreamWriter
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(s1);
		oos.flush();
		byte[] b = bos.toByteArray();
		
		//反序列化生成
		ByteArrayInputStream bis = new ByteArrayInputStream(b);
		ObjectInputStream ois = new ObjectInputStream(bis);
		Student s2 = (Student)ois.readObject();
		System.out.println(s2.getName());
		
	}

}

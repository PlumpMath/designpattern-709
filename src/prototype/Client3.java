package prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class Client3 {

	public static void main(String[] args) throws Exception {
		//ǳ����,�����������ͽ������˵�ַ.��date����
		//Ҫ��ʵ����ȿ�������ͨ��
		//1.��clone�����ж���������Ҳ���е���clone()����
		//2.ͨ�����л��ͷ����л�
		Date d = new Date(12312424L);
		Student s1 = new Student("tom", d);

		//ת���� InputStreamReader OutputStreamWriter
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(s1);
		oos.flush();
		byte[] b = bos.toByteArray();
		
		//�����л�����
		ByteArrayInputStream bis = new ByteArrayInputStream(b);
		ObjectInputStream ois = new ObjectInputStream(bis);
		Student s2 = (Student)ois.readObject();
		System.out.println(s2.getName());
		
	}

}

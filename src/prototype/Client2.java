package prototype;

import java.util.Date;

public class Client2 {

	public static void main(String[] args) throws Exception {
		//ǳ����,�����������ͽ������˵�ַ.��date����
		//Ҫ��ʵ����ȿ�������ͨ��
		//1.��clone�����ж���������Ҳ���е���clone()����
		//2.ͨ�����л��ͷ����л�
		Date d = new Date(12312424L);
		Student s1 = new Student("tom", d);
		Student s2 = (Student)s1.clone();
		System.out.println("s1�޸�ǰ:"+s1.getBirthday());
		//�޸�d��ֵ,s2�е�birthday���ű仯
		d.setTime(333333L);
		System.out.println("s1�޸ĺ�:"+s1.getBirthday());
		System.out.println("s2�޸ĺ�:"+s2.getBirthday());
		System.out.println(s2.getName());
	}

}

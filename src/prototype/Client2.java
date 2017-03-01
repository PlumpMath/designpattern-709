package prototype;

import java.util.Date;

public class Client2 {

	public static void main(String[] args) throws Exception {
		//浅拷贝,对于引用类型仅拷贝了地址.如date类型
		//要想实现深度拷贝可以通过
		//1.在clone方法中对引用类型也进行调用clone()方法
		//2.通过序列化和反序列化
		Date d = new Date(12312424L);
		Student s1 = new Student("tom", d);
		Student s2 = (Student)s1.clone();
		System.out.println("s1修改前:"+s1.getBirthday());
		//修改d的值,s2中的birthday跟着变化
		d.setTime(333333L);
		System.out.println("s1修改后:"+s1.getBirthday());
		System.out.println("s2修改后:"+s2.getBirthday());
		System.out.println(s2.getName());
	}

}

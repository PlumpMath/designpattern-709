package prototype;

import java.util.Date;

public class Student2 implements Cloneable {
	private String name;
	private Date birthday;
	
	public Student2(String name, Date d) {
		this.name = name;
		this.birthday = d;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object obj = super.clone();
		Student2 s = (Student2)obj;
		s.birthday = (Date)this.birthday.clone();//clone 引用类型属性
		return obj;
	}
	
}

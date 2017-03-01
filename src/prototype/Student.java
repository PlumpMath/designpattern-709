package prototype;

import java.io.Serializable;
import java.util.Date;

public class Student implements Cloneable,Serializable {
	private String name;
	private Date birthday;
	
	public Student(String name, Date d) {
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
		return super.clone();
	}
	
}

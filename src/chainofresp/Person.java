package chainofresp;

//客户请求信息
public class Person {
	private String name;
	private int days;
	
	public Person(String name, int days) {
		super();
		this.name = name;
		this.days = days;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}
	
}

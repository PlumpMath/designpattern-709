package chainofresp;

public class Client {

	public static void main(String[] args) {
		Leader teacher = new Teacher("张三老师");
		Leader department = new Department("李四系主任");
		Leader dean = new Dean("王五院长");
		Leader president = new President("赵六校长");
		//设置上级
		teacher.setLeader(department);
		department.setLeader(dean);
		dean.setLeader(president);
		//请假操作
		Person p = new Person("小二", 5);
		teacher.handleRequest(p);
	}

}

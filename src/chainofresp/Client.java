package chainofresp;

public class Client {

	public static void main(String[] args) {
		Leader teacher = new Teacher("������ʦ");
		Leader department = new Department("����ϵ����");
		Leader dean = new Dean("����Ժ��");
		Leader president = new President("����У��");
		//�����ϼ�
		teacher.setLeader(department);
		department.setLeader(dean);
		dean.setLeader(president);
		//��ٲ���
		Person p = new Person("С��", 5);
		teacher.handleRequest(p);
	}

}

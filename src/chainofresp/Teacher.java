package chainofresp;

public class Teacher extends Leader {

	public Teacher(String name) {
		super(name);
	}

	@Override
	public void handleRequest(Person p) {
		if(p.getDays()<=3){
			System.out.print("��ʦ:" + name + " ����ͨ�� " + p.getName() + "��"+ p.getDays() + "�����~");
		}else{
			nextLeader.handleRequest(p);
		}
	}

}

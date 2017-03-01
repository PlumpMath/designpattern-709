package chainofresp;

public class Department extends Leader {

	public Department(String name) {
		super(name);
	}

	@Override
	public void handleRequest(Person p) {
		if(p.getDays()<=5){
			System.out.print("ϵ����:" + name + " ����ͨ�� " + p.getName() + "��"+ p.getDays() + "�����~");
		}else{
			this.nextLeader.handleRequest(p);
		}
	}

}

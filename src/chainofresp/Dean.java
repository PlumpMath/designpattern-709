package chainofresp;

public class Dean extends Leader {

	public Dean(String name) {
		super(name);
	}

	@Override
	public void handleRequest(Person p) {
		if(p.getDays()<=10){
			System.out.print("Ժ��:" + name + " ����ͨ�� " + p.getName() + "��"+ p.getDays() + "�����~");
		}else{
			this.nextLeader.handleRequest(p);
		}
	}

}

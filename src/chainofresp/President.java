package chainofresp;

public class President extends Leader {

	public President(String name) {
		super(name);
	}

	@Override
	public void handleRequest(Person p) {
		if(p.getDays()<=15){
			System.out.print("У��:" + name + " ����ͨ�� " + p.getName() + "��"+ p.getDays() + "�����~");
		}else{
			System.out.print("���ڲ��ɳ�15��");
		}
	}

}

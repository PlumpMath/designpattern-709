package state;

//����(Context)��ɫ��Ҳ�������ģ�����ͻ���������Ȥ�Ľӿڣ����ұ���һ������״̬���ʵ�����������״̬���ʵ�������˻������������״̬��
public class Room {
	private State state;
	
	public void setState(State state){
		this.state = state;
		state.handle();
	}
}

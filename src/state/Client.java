package state;

public class Client {

	public static void main(String[] args) {
		// ��ν״̬ģʽ��������������ڲ�״̬�����ı�ʱ�ı�������Ϊ���������������޸���������
		// context����״̬state������,��¶�ı�state�Ľӿ�,ͨ���ı�state״̬���ı�context����Ϊ
		Room room = new Room();
		room.setState(new EmptyState());
		room.setState(new BookedState());
		room.setState(new CheckedState());
	}

}

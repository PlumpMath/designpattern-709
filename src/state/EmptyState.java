package state;

//����״̬(ConcreteState)��ɫ��ÿһ������״̬�඼ʵ���˻�����Context����һ��״̬����Ӧ����Ϊ��
public class EmptyState implements State {

	@Override
	public void handle() {
		System.out.println("�յ�,������ס.");
	}

}

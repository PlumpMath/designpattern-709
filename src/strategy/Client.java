package strategy;

public class Client {

	public static void main(String[] args) {
		// ����ģʽ��״̬ģʽ����,��ͬ����״̬ģʽ����״̬ʵ�ֲ�ͬ����Ϊ.������ģʽ�л����ǲ�ͬ���㷨
		// ���Ͽ���ԭ��,��������µ��㷨
		Context c = new Context();
		c.setStartegy(new OldMany());
		c.printPrice(100);
	}

}

package proxystatic;

//Proxy: �����ɫ�������������ʵ����ʵ����ͬ�Ľӿڣ��������ܹ����κ�ʱ�̶��ܹ�������ʵ����
//�����ɫ�ڲ������ж���ʵ��������ã����������Բ�����ʵ����ͬʱҲ���Ը��������Ĳ������൱�ڶ���ʵ������з�װ��
public class ProxyStar implements Star {
	Star realStar;
	
	public ProxyStar(Star realStar) {
		super();
		this.realStar = realStar;
	}

	@Override
	public void signContract() {
		System.out.println("proxy signContract...");
	}

	@Override
	public void sing() {
		realStar.sing();
	}

	@Override
	public void getMoney() {
		System.out.println("proxy getMoney...");
	}

}

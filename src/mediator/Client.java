package mediator;

public class Client {
	//��ν�н���ģʽ������һ���н��������װһϵ�еĶ��󽻻����н���ʹ��������Ҫ��ʽ���໥���ã�
	//�Ӷ�ʹ�������ɢ�����ҿ��Զ����ظı�����֮��Ľ���
	
	
	public static void main(String[] args){
		Mediator mediator = new ConcreteMediator();
		Person p1 = new PersonA("zs", mediator);
		Person p2 = new PersonB("ls", mediator);
		Person p3 = new PersonC("ww", mediator);
		
		p1.linkMediator("��Һ�����"+p1.name);
		System.out.println("**************************");
		p2.linkMediator("��Һ�����"+p2.name);
		System.out.println("**************************");
		p3.linkMediator("��Һ�����"+p3.name);
	}
}

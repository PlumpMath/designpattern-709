package templateMethod;

public class Client {

	public static void main(String[] args) {
		// �ڷ����ж���һ���㷨�ĹǼ�,�����ֲ����ӳٵ�������ȥʵ��.
		// ģ�淽��ʹ����������ڲ��ı��㷨�ṹ�������,���¶����㷨�е�ĳЩ����
		
		//ʹ�ü̳�
		BankTemplateMethod b1 = new DrawMoney();
		b1.process();
		System.out.println("*******************");
		//����ʹ�������ڲ���ȥʵ��
		BankTemplateMethod b2 = new BankTemplateMethod(){
			@Override
			public void service() {
				System.out.println("save money...");
			}
		};
		b2.process();
	}

}

class DrawMoney extends BankTemplateMethod{

	@Override
	public void service() {
		System.out.println("draw money...");
	}
	
}

package command;

public class Client {

	public static void main(String[] args) {
		//����ģʽ�������װ�ɶ����Ա�ʹ�ò�ͬ�����󡢶��л�����־����������������ͬʱ����ģʽ֧�ֿɳ����Ĳ�����
		//����ģʽ�ı��ʾ����ڽ�������з�װ����������������κ�ִ����������ηֿ����ǵķ�����ֻ��Ҫ֪����η�������ɣ�����Ҫ���������ʵ�ֵģ���������ִ���Ƿ�ɹ�������Ҫ��ᡣ
		//ͬʱ����ģʽʹ������Ҳ�����һ������������������һ�����Ա��洢�ʹ��ݡ�
		Command cmd = new ConcreteCommand(new Receiver());
		Invoker invoker = new Invoker(cmd);//invoker��Ҳ���Գ���cmd�б�,ѭ������
		invoker.invoke();
		
		//����ִ�ж������
		Invoker invoker1 = new Invoker();
		invoker1.addCmd(new ConcreteCommand(new Receiver()));
		invoker1.addCmd(new ConcreteCommand(new Receiver()));
		invoker1.addCmd(new ConcreteCommand(new Receiver()));
		invoker1.addCmd(new ConcreteCommand(new Receiver()));
		invoker1.invokeAll();
	}

}

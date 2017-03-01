package command;

//���������ࡣ��һ�������߶������һ�����������ý�������Ӧ�Ĳ�������ʵ��Excute��
public class ConcreteCommand implements Command{
	private Receiver receiver;
	
	public ConcreteCommand(Receiver receiver) {
		super();
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		receiver.action();
	}

}

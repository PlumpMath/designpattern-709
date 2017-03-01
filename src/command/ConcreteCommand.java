package command;

//具体命令类。将一个接收者对象绑定于一个动作，调用接收者相应的操作，以实现Excute。
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

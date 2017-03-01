package command;

public class Client {

	public static void main(String[] args) {
		//命令模式将请求封装成对象，以便使用不同的请求、队列或者日志来参数化其他对象。同时命令模式支持可撤销的操作。
		//命令模式的本质就在于将命令进行封装，将发出命令的责任和执行命令的责任分开，是的发送者只需要知道如何发送命令即可，不需要命令是如何实现的，甚至命令执行是否成功都不需要理会。
		//同时命令模式使得请求也变成了一个对象，它像其他对象一样可以被存储和传递。
		Command cmd = new ConcreteCommand(new Receiver());
		Invoker invoker = new Invoker(cmd);//invoker中也可以持有cmd列表,循环调用
		invoker.invoke();
		
		//批量执行多个命令
		Invoker invoker1 = new Invoker();
		invoker1.addCmd(new ConcreteCommand(new Receiver()));
		invoker1.addCmd(new ConcreteCommand(new Receiver()));
		invoker1.addCmd(new ConcreteCommand(new Receiver()));
		invoker1.addCmd(new ConcreteCommand(new Receiver()));
		invoker1.invokeAll();
	}

}

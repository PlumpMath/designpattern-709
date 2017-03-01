package command;

import java.util.ArrayList;
import java.util.List;

//知道如何实施与执行一个请求相关的操作，任何类都有可能成为一个接收者。
public class Invoker {
	private Command cmd;
	private List<Command> cmdList = new ArrayList<Command>();
	public Invoker(Command cmd) {
		super();
		this.cmd = cmd;
	}
	
	public Invoker() {
		super();
	}

	public void invoke(){
		cmd.execute();
	}
	
	public void addCmd(Command cmd){
		cmdList.add(cmd);
	}
	
	public void invokeAll(){
		for(Command cmd : cmdList){
			cmd.execute();
		}
	}
}

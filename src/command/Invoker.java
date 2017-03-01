package command;

import java.util.ArrayList;
import java.util.List;

//֪�����ʵʩ��ִ��һ��������صĲ������κ��඼�п��ܳ�Ϊһ�������ߡ�
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

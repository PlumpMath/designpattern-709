package command;

import java.util.ArrayList;
import java.util.List;

//接收者。知道如何实施与执行一个请求相关的操作，任何类都有可能成为一个接收者。
public class Receiver {
	public void action(){
		System.out.println("Receiver.action()");
	}
}

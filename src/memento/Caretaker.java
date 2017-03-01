package memento;

import java.util.HashMap;
import java.util.Map;

//Caretaker: 负责人。负责保存好备忘录，不能对备忘录的内容进行操作和访问，只能够将备忘录传递给其他对象
public class Caretaker {
	private Map<String,Memento> map = new HashMap<String,Memento>();
	
	public void setMemento(String name,Memento m){
		map.put(name, m);
	}
	
	public Memento getMemento(String name){
		return map.get(name);
	}
}

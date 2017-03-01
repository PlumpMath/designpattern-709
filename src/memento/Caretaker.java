package memento;

import java.util.HashMap;
import java.util.Map;

//Caretaker: �����ˡ����𱣴�ñ���¼�����ܶԱ���¼�����ݽ��в����ͷ��ʣ�ֻ�ܹ�������¼���ݸ���������
public class Caretaker {
	private Map<String,Memento> map = new HashMap<String,Memento>();
	
	public void setMemento(String name,Memento m){
		map.put(name, m);
	}
	
	public Memento getMemento(String name){
		return map.get(name);
	}
}

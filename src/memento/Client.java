package memento;

public class Client {
	
	public static void main(String[] args) {
		//��ν����¼ģʽ�����ڲ��ƻ���װ��ǰ���£�����һ��������ڲ�״̬�����ڸö���֮�Ᵽ�����״̬�������������Ժ󽫶���ָ���ԭ�ȱ����״̬��
		Role role = new Role(100,100);
		Caretaker taker = new Caretaker();
		role.setBlood(80).setMagic(95);
		taker.setMemento("one", role.save());
		role.setBlood(70).setMagic(80);
		taker.setMemento("two", role.save());
		role.setBlood(50).setMagic(75);
		taker.setMemento("three", role.save());
		role.setBlood(20).setMagic(15);
		taker.setMemento("four", role.save());
		
		//recover test 
		role.recover(taker.getMemento("one"));
		System.out.println(role);
		
		role.recover(taker.getMemento("three"));
		System.out.println(role);
	}

}

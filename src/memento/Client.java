package memento;

public class Client {
	
	public static void main(String[] args) {
		//所谓备忘录模式就是在不破坏封装的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态，这样可以在以后将对象恢复到原先保存的状态。
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

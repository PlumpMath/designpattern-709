package memento;

//备忘录。用于存储Originator的内部状态，并且可以防止Originator以外的对象访问Memento
public class Memento {
	private int blood,magic;
	public Memento(int blood, int magic) {
		this.blood = blood;
		this.magic = magic;
	}
	public int getBlood() {
		return blood;
	}
	public int getMagic() {
		return magic;
	}
}

package memento;

//����¼�����ڴ洢Originator���ڲ�״̬�����ҿ��Է�ֹOriginator����Ķ������Memento
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

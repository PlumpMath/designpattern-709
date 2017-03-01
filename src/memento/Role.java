package memento;

//ԭ����,����Ҫ�������Ϣ
public class Role {
	private int blood;
	private int magic;
	
	public Role(int blood, int magic) {
		super();
		this.blood = blood;
		this.magic = magic;
	}
	
	public Role setBlood(int blood) {
		this.blood = blood;
		return this;
	}
	
	public Role setMagic(int magic) {
		this.magic = magic;
		return this;
	}
	
	@Override
	public String toString() {
		return "blood:"+blood+";magic:"+magic;
	}
	
	public Memento save(){
		return new Memento(blood,magic);
	}
	
	public void recover(Memento m){
		this.blood = m.getBlood();
		this.magic = m.getMagic();
	}
}

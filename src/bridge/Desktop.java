package bridge;

public class Desktop extends Computer {

	public Desktop(Brand brand) {
		super(brand);
	}

	@Override
	public void sale() {
		super.sale();
		System.out.println("����̨ʽ��");
	}
	
	
}

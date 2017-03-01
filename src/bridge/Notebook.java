package bridge;

public class Notebook extends Computer {

	public Notebook(Brand brand) {
		super(brand);
	}

	@Override
	public void sale() {
		super.sale();
		System.out.println("销售笔记本");
	}
	
	
}

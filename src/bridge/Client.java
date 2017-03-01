package bridge;

public class Client {

	public static void main(String[] args) {
		Computer c1 = new Desktop(new Dell());
		c1.sale();
		
		Computer c2 = new Notebook(new Acer());
		c2.sale();
	}

}

package proxystatic;

public class Client {

	public static void main(String[] args) {
		Star realStar = new RealStar();
		Star proxy = new ProxyStar(realStar);
		proxy.signContract();
		proxy.sing();
		proxy.getMoney();
	}

}

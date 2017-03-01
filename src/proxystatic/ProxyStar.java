package proxystatic;

//Proxy: 代理角色。代理对象与真实对象实现相同的接口，所以它能够在任何时刻都能够代理真实对象。
//代理角色内部包含有对真实对象的引用，所以她可以操作真实对象，同时也可以附加其他的操作，相当于对真实对象进行封装。
public class ProxyStar implements Star {
	Star realStar;
	
	public ProxyStar(Star realStar) {
		super();
		this.realStar = realStar;
	}

	@Override
	public void signContract() {
		System.out.println("proxy signContract...");
	}

	@Override
	public void sing() {
		realStar.sing();
	}

	@Override
	public void getMoney() {
		System.out.println("proxy getMoney...");
	}

}

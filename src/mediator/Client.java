package mediator;

public class Client {
	//所谓中介者模式就是用一个中介对象来封装一系列的对象交互，中介者使各对象不需要显式地相互引用，
	//从而使其耦合松散，而且可以独立地改变它们之间的交互
	
	
	public static void main(String[] args){
		Mediator mediator = new ConcreteMediator();
		Person p1 = new PersonA("zs", mediator);
		Person p2 = new PersonB("ls", mediator);
		Person p3 = new PersonC("ww", mediator);
		
		p1.linkMediator("大家好我是"+p1.name);
		System.out.println("**************************");
		p2.linkMediator("大家好我是"+p2.name);
		System.out.println("**************************");
		p3.linkMediator("大家好我是"+p3.name);
	}
}

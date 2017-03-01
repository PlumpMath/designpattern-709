package templateMethod;

public class Client {

	public static void main(String[] args) {
		// 在方法中定义一个算法的骨架,将部分步骤延迟到子类中去实现.
		// 模版方法使得子类可以在不改变算法结构的情况下,重新定义算法中的某些步骤
		
		//使用继承
		BankTemplateMethod b1 = new DrawMoney();
		b1.process();
		System.out.println("*******************");
		//可以使用匿名内部类去实现
		BankTemplateMethod b2 = new BankTemplateMethod(){
			@Override
			public void service() {
				System.out.println("save money...");
			}
		};
		b2.process();
	}

}

class DrawMoney extends BankTemplateMethod{

	@Override
	public void service() {
		System.out.println("draw money...");
	}
	
}

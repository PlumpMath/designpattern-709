package strategy;

public class Client {

	public static void main(String[] args) {
		// 策略模式和状态模式相似,不同的是状态模式根据状态实现不同的行为.而策略模式切换的是不同的算法
		// 符合开闭原则,灵活的添加新的算法
		Context c = new Context();
		c.setStartegy(new OldMany());
		c.printPrice(100);
	}

}

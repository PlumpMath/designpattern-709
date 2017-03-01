package facade;

public class Client {
	public static void main(String[] args){
		//没有引用外观模式,想完成喝茶必须要知道了解三个对象
//		Water water = new Water();
//		water.heatUp();
//		Cup cup = new Cup();
//		cup.wash();
//		Tea tea = new Tea();
//		tea.make();
		
		//外观模式,使用Drink对象封装以上所有的步骤
		new Drink().drinkTea();
	}
}

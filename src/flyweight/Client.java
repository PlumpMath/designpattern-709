package flyweight;

public class Client {
	public static void main(String[] args){
		ChessFlyweight c2 = FlyweightFactory.getChess("黑色");
		ChessFlyweight c1 = FlyweightFactory.getChess("黑色");
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		//添加外部状态
		c1.display(new Coordinate(10,10));
		c2.display(new Coordinate(20,20));
	}
}

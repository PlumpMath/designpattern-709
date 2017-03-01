package flyweight;

//Flyweight: 抽象享元类。所有具体享元类的超类或者接口，通过这个接口，Flyweight可以接受并作用于外部专题。
public interface ChessFlyweight {
	void setColor(String c);
	String getColor();
	void display(Coordinate c);//显示棋子信息
}

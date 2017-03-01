package flyweight;

//ConcreteFlyweight: 具体享元类。指定内部状态，为内部状态增加存储空间。 
public class ConcreteChess implements ChessFlyweight {
	private String color;
	@Override
	public void setColor(String c) {
		color = c;
	}

	@Override
	public String getColor() {
		return color;
	}

	@Override
	public void display(Coordinate c) {
		System.out.println("chess color:" + color);
		System.out.println("chess location:" + c.getX() + "---" + c.getY());
	}

	public ConcreteChess(String color) {
		super();
		this.color = color;
	}
	
}

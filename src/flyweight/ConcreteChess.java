package flyweight;

//ConcreteFlyweight: ������Ԫ�ࡣָ���ڲ�״̬��Ϊ�ڲ�״̬���Ӵ洢�ռ䡣 
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

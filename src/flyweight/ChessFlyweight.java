package flyweight;

//Flyweight: ������Ԫ�ࡣ���о�����Ԫ��ĳ�����߽ӿڣ�ͨ������ӿڣ�Flyweight���Խ��ܲ��������ⲿר�⡣
public interface ChessFlyweight {
	void setColor(String c);
	String getColor();
	void display(Coordinate c);//��ʾ������Ϣ
}

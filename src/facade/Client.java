package facade;

public class Client {
	public static void main(String[] args){
		//û���������ģʽ,����ɺȲ����Ҫ֪���˽���������
//		Water water = new Water();
//		water.heatUp();
//		Cup cup = new Cup();
//		cup.wash();
//		Tea tea = new Tea();
//		tea.make();
		
		//���ģʽ,ʹ��Drink�����װ�������еĲ���
		new Drink().drinkTea();
	}
}

package builder;

public class Client {

	public static void main(String[] args) {
		//������ģʽ��һ�����Ӷ���Ĺ������ʾ���룬ʹ��ͬ���Ĺ������̿��Դ�����ͬ�ı�ʾ
		//�����췽����ͬ������Ĳ�Ʒ���Բ�ͬ����ȻҲ����ͨ���̳�ȥ���½���ķ�ʽ
		Director director = new MealDirector(new MealBBuilder()); 
		Meal meal = director.director();
		
		System.out.println(meal.getDrink());
	}

}

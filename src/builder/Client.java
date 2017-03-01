package builder;

public class Client {

	public static void main(String[] args) {
		//建造者模式将一个复杂对象的构建与表示分离，使得同样的构建过程可以创建不同的表示
		//即建造方法相同，建造的产品可以不同。当然也可以通过继承去更新建造的方式
		Director director = new MealDirector(new MealBBuilder()); 
		Meal meal = director.director();
		
		System.out.println(meal.getDrink());
	}

}

package builder;

public class MealABuilder implements MealBuilder {

	@Override
	public String builderFood() {
		System.out.println("建造食品");
		return "汉堡";
	}

	@Override
	public String builderDrink() {
		System.out.println("建造饮料");
		return "橙汁";
	}

}

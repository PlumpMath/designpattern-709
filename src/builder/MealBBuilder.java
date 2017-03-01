package builder;

public class MealBBuilder implements MealBuilder {

	@Override
	public String builderFood() {
		System.out.println("建造薯条");
		return "薯条";
	}

	@Override
	public String builderDrink() {
		System.out.println("建造饮料");
		return "可乐";
	}

}

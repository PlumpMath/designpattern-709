package builder;

public class MealBBuilder implements MealBuilder {

	@Override
	public String builderFood() {
		System.out.println("��������");
		return "����";
	}

	@Override
	public String builderDrink() {
		System.out.println("��������");
		return "����";
	}

}

package builder;

public class MealABuilder implements MealBuilder {

	@Override
	public String builderFood() {
		System.out.println("����ʳƷ");
		return "����";
	}

	@Override
	public String builderDrink() {
		System.out.println("��������");
		return "��֭";
	}

}

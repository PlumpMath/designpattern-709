package builder;

public class MealDirector implements Director {
	
	MealBuilder builder;
	
	//װ��meal
	@Override
	public Meal director() {
		Meal meal = new Meal();
		meal.setDrink(builder.builderDrink());
		meal.setFood(builder.builderFood());
		return meal;
	}
	
	public MealDirector(MealBuilder builder){
		this.builder = builder;
	}
}

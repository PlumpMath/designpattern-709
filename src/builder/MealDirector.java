package builder;

public class MealDirector implements Director {
	
	MealBuilder builder;
	
	//×°Åämeal
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

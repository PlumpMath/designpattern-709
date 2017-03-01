package facade;

public class Drink {
	public void drinkTea(){
		Water water = new Water();
		water.heatUp();
		Cup cup = new Cup();
		cup.wash();
		Tea tea = new Tea();
		tea.make();
	}
}

package templateMethod;

public abstract class BankTemplateMethod {
	public void takeNumber(){
		System.out.println("take number...");
	}
	
	public abstract void service();
	
	public void evaluate(){
		System.out.println("give score...");
	}
	
	public final void process(){
		takeNumber();
		service();
		evaluate();
	}
}

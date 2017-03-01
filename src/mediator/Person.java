package mediator;

public abstract class Person {
	protected String name;
	protected Mediator mediator;
	
	public Person(String name, Mediator mediator) {
		super();
		this.name = name;
		this.mediator = mediator;
		mediator.register(this);
	}
	
	public abstract void linkMediator(String message);//联系中介者
	public abstract void getMessage(String message);//接收中介者信息
}

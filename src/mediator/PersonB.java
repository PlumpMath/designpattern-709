package mediator;

public class PersonB extends Person {

	public PersonB(String name, Mediator mediator) {
		super(name, mediator);
	}

	@Override
	public void linkMediator(String message) {
		mediator.contact(message, this);
	}

	@Override
	public void getMessage(String message) {
		System.out.println("personB:" + name + " get message:" + message);
	}
	
	
}

package mediator;

public class PersonC extends Person {

	public PersonC(String name, Mediator mediator) {
		super(name, mediator);
	}

	@Override
	public void linkMediator(String message) {
		mediator.contact(message, this);
	}

	@Override
	public void getMessage(String message) {
		System.out.println("personC:" + name + " get message:" + message);
	}
	
	
}

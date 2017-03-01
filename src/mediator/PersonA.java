package mediator;

public class PersonA extends Person {

	public PersonA(String name, Mediator mediator) {
		super(name, mediator);
	}

	@Override
	public void linkMediator(String message) {
		mediator.contact(message, this);
	}

	@Override
	public void getMessage(String message) {
		System.out.println("personA:" + name + " get message:" + message);
	}
	
	
}

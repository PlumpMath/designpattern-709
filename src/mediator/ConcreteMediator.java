package mediator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements Mediator {
	private List<Person> list = new ArrayList<Person>();
	
	public void register(Person p){
		list.add(p);
	}
	
	@Override
	public void contact(String message, Person person) {
		for(Person p:list){
			if(p==person){
				continue;
			}
			p.getMessage(message);
		}
	}
	
}

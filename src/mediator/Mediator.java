package mediator;

//Mediator: 抽象中介者。定义了同事对象到中介者对象之间的接口。
public interface Mediator {
	void contact(String message,Person p);
	void register(Person p);
}

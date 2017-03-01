package state;

//具体状态(ConcreteState)角色：每一个具体状态类都实现了环境（Context）的一个状态所对应的行为。
public class EmptyState implements State {

	@Override
	public void handle() {
		System.out.println("空的,可以入住.");
	}

}

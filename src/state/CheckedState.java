package state;

public class CheckedState implements State {

	@Override
	public void handle() {
		System.out.println("已有人入住.");
	}

}

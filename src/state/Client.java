package state;

public class Client {

	public static void main(String[] args) {
		// 所谓状态模式就是允许对象在内部状态发生改变时改变它的行为，对象看起来好像修改了它的类
		// context持有状态state的引用,暴露改变state的接口,通过改变state状态来改变context的行为
		Room room = new Room();
		room.setState(new EmptyState());
		room.setState(new BookedState());
		room.setState(new CheckedState());
	}

}

package state;

//环境(Context)角色，也成上下文：定义客户端所感兴趣的接口，并且保留一个具体状态类的实例。这个具体状态类的实例给出此环境对象的现有状态。
public class Room {
	private State state;
	
	public void setState(State state){
		this.state = state;
		state.handle();
	}
}

package state;

//State: 抽象状态类。State定义了一个所有具体状态的共同接口，任何状态都实现这个相同的接口，这样一来，状态之间就可以互相转换了。 
public interface State {
	void handle();
}

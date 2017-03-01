package adapter;

//适配器的抽象类,用于暴露给client
//适配器实现此抽象类,这样用户只需要关心此接口.而不需要关心不同适配方式
public interface Target {
	void handleReq();
}

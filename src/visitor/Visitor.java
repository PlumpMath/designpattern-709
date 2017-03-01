package visitor;

//访问者：实现抽象访问者所声明的方法，它影响到访问者访问到一个类后该干什么，要做什么事情。
//可以实现不同的访问者执行不同的visit逻辑行为
public class Visitor implements IVisitor {

	@Override
	public void visit(ConcreteElement1 el1) {
		el1.doSth();
	}

	@Override
	public void visit(ConcreteElement2 el2) {
		el2.doSth();
	}

}

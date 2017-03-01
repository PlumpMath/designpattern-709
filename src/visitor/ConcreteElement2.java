package visitor;

public class ConcreteElement2 extends Element {

	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}

	@Override
	public void doSth() {
		System.out.println("ÕâÊÇÔªËØ2");
	}

}

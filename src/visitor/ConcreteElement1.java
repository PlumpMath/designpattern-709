package visitor;
///Ԫ���ࣺʵ�ֳ���Ԫ������������accept������ͨ������visitor.visit(this)���������Ѿ��γ�һ�ֶ�ʽ�ˡ�
public class ConcreteElement1 extends Element {

	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}

	@Override
	public void doSth() {
		System.out.println("����Ԫ��1");
	}

}

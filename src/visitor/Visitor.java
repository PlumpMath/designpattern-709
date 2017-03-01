package visitor;

//�����ߣ�ʵ�ֳ���������������ķ�������Ӱ�쵽�����߷��ʵ�һ�����ø�ʲô��Ҫ��ʲô���顣
//����ʵ�ֲ�ͬ�ķ�����ִ�в�ͬ��visit�߼���Ϊ
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

package visitor;
//����Ԫ���ࣺ�ӿڻ��߳����࣬����������һ������߷��ʣ���������ͨ��accept�����еĲ���������ġ�����Ԫ��һ�������෽����һ�����Ǳ����ҵ���߼��������������������������������
public abstract class Element {

	public abstract void accept(IVisitor visitor);
	public abstract void doSth();
	
}

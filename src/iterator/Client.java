package iterator;

public class Client {

	public static void main(String[] args) {
		//������ģʽ�ṩһ�ַ��������ʾۺ϶��󣬶����ñ�¶���������ڲ���ʾ��
		ConcreteMyAggregate cma = new ConcreteMyAggregate();
		cma.add("a");
		cma.add("b");
		cma.add("c");
		cma.add("d");
		cma.add("e");
		MyIterator iterator = cma.getIterator();
		while(iterator.hasNext()){
			System.out.println(iterator.getCurrent());
			iterator.next();
		}
	}

}

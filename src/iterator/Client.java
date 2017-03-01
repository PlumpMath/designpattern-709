package iterator;

public class Client {

	public static void main(String[] args) {
		//迭代器模式提供一种方法来访问聚合对象，而不用暴露这个对象的内部表示。
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

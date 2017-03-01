package iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMyAggregate {
	private List<Object> list = new ArrayList<Object>();
	
	public void add(Object o){
		list.add(o);
	}
	
	public MyIterator getIterator(){
		return new ConcreteIterator();
	}
	
	class ConcreteIterator implements MyIterator{
		private int cursor = 0;
		@Override
		public void next() {
			if(cursor < list.size()){
				cursor++;
			}
		}

		@Override
		public boolean hasNext() {
			return cursor < list.size();
		}

		@Override
		public Object getCurrent() {
			return list.get(cursor);
		}
		
	}
}

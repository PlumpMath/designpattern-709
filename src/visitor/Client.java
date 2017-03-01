package visitor;

import java.util.List;

public class Client {

	public static void main(String[] args) {
		// 访问者模式即表示一个作用于某对象结构中的各元素的操作，它使我们可以在不改变各元素的类的前提下定义作用于这些元素的新操作。
		//http://blog.csdn.net/zhengzhb/article/details/7489639
		
		List<Element> list = StrutureObject.getList();
		for(Element e:list){
			e.accept(new Visitor());
		}

	}

}

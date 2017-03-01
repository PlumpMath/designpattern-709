package visitor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
//结构对象：一个元素的容器，一般包含一个容纳多个不同类、不同接口的容器，如List、Set、Map等，在项目中一般很少抽象出这个角色。
public class StrutureObject {
	public static List<Element> getList(){
		List<Element> list = new ArrayList<Element>();
		Random r = new Random();
		for(int i=0;i<100;i++){
			int a = r.nextInt(100);
			if(a>50){
				list.add(new ConcreteElement1());
			}else{
				list.add(new ConcreteElement2());
			}
		}
		return list;
	}
}

package visitor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
//�ṹ����һ��Ԫ�ص�������һ�����һ�����ɶ����ͬ�ࡢ��ͬ�ӿڵ���������List��Set��Map�ȣ�����Ŀ��һ����ٳ���������ɫ��
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

package visitor;

import java.util.List;

public class Client {

	public static void main(String[] args) {
		// ������ģʽ����ʾһ��������ĳ����ṹ�еĸ�Ԫ�صĲ�������ʹ���ǿ����ڲ��ı��Ԫ�ص����ǰ���¶�����������ЩԪ�ص��²�����
		//http://blog.csdn.net/zhengzhb/article/details/7489639
		
		List<Element> list = StrutureObject.getList();
		for(Element e:list){
			e.accept(new Visitor());
		}

	}

}

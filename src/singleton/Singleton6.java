package singleton;

import java.io.Serializable;

/**
 * ����ʽ,����ʵ����ʱ���ȥ�����õ�������
 * @author zcl13993
 *
 */
public class Singleton6 implements Serializable {
		
	private static Singleton6 instance = null;
	
	private Singleton6(){}
	
	public static Singleton6 getInstance(){
		if(null==instance){
			instance = new Singleton6();
		}
		return instance;
	}
	
	//���л������ṩ��һ�����ر�Ĺ��ӣ�hook��-���о���һ��˽�еı�ʵ�����ķ���readresolve(),
	//�����������ȷ����Ŀ�����Ա�����л����᷵��������object�Ͼ��з���Ȩ
//	private Object readResolve(){
//		return instance;
//	}
	
}

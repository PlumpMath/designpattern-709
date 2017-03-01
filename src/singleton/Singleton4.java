package singleton;
/**
 * ��̬�ڲ���ʵ���ӳټ���
 * @author zcl13993
 *
 */
public class Singleton4 {
	
	private Singleton4(){}
	
	private static class Single{
		static final Singleton4 INSTANCE = new Singleton4();
	}
	
	public static Singleton4 getInstance(){
		return Single.INSTANCE;
	}
}

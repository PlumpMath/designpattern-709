package singleton;

/**
 * Ë«ÖØ¼ì²âËø
 * @author zcl13993
 *
 */
public class Singleton3 {
	
	private static Singleton3 instance = null;
	
	private Singleton3(){}
	
	public static Singleton3 getInstance(){
		if(null==instance){
			synchronized(Singleton3.class){
				if(null==instance){
					instance = new Singleton3();
				}
			}
		}
		return instance;
		
	}
}

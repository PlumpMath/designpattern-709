package factory.simplefactory;

import factory.factorymethod.BYD;
import factory.factorymethod.Car;

/**
 * �򵥹���
 * @author zcl13993
 *
 */
public class CarFactory {
	public static Car getCar(String brandName){
		//Ҳ����ʹ��switch...case
		if(brandName.equals("BYD")){
			return new BYD();
		}else if(brandName.equals("RedFlag")){
			return new RedFlag();
		}else{
			return null;
		}
	}
}

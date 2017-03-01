package factory.simplefactory;

import factory.factorymethod.BYD;
import factory.factorymethod.Car;

/**
 * 简单工厂
 * @author zcl13993
 *
 */
public class CarFactory {
	public static Car getCar(String brandName){
		//也可以使用switch...case
		if(brandName.equals("BYD")){
			return new BYD();
		}else if(brandName.equals("RedFlag")){
			return new RedFlag();
		}else{
			return null;
		}
	}
}

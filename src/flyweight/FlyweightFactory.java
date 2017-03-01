package flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
	private static Map<String, ChessFlyweight> map = new HashMap<String, ChessFlyweight>();
	
	public static ChessFlyweight getChess(String color){
		ChessFlyweight chess = map.get(color);
		if(chess == null){
			chess = new ConcreteChess(color);
			map.put(color, chess);
		}
		return chess;
	}
}

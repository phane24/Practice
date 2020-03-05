package MapInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapExample3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Map<Integer, String> map=new HashMap<Integer, String>();
	    map.put(4, "Usha");
	    map.put(5, "Madhuri");
	    map.put(1, "Phane");
	    map.put(2, "Kiran");
	    map.put(3, "Neeraja");

	    map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
	  	
	}
}

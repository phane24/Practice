package MapInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Map<Integer, String> map=new HashMap<Integer, String>();
	    map.put(4, "Usha");
	    map.put(5, "Madhuri");
	    map.put(1, "Phane");
	    map.put(2, "Kiran");
	    map.put(3, "Neeraja");
	    for(Entry<Integer, String> e :map.entrySet()) {
	    	System.out.println(e.getKey()+" "+e.getValue());
	    }
	  	
	}

}

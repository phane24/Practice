package MapInterface;
import java.util.*;
import java.util.Map.Entry;  
public class MapExample1 {  
public static void main(String[] args) {  
   
	
	Map map=new HashMap();
    map.put(4, "Usha");
    map.put(5, "Madhuri");
    map.put(1, "Phane");
    map.put(2, "Kiran");
    map.put(3, "Neeraja");
  
    
    Set set=map.entrySet();
    Iterator iterator=set.iterator();
    while(iterator.hasNext()) {
    	Map.Entry entry=(Entry) iterator.next();
    	System.out.println(entry.getKey()+"="+entry.getValue());
    }
    
}
}
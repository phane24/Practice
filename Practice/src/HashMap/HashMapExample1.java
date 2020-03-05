package HashMap;
import java.util.*;
public class HashMapExample1 {
	
	public static void main(String args[]) {
		
		HashMap<Integer, String> hashmap= new HashMap<Integer,String>();
		hashmap.put(4, "Usha");
		hashmap.put(5, "Madhuri");
		hashmap.put(1, "Phane");
		hashmap.put(2, "Kiran");
		hashmap.put(3, "Neeraja");
		
		System.out.println(" Inital HashMap");
		for(Map.Entry<Integer, String> entry:hashmap.entrySet()) {
			System.out.println(entry.getKey() +" "+ entry.getValue());
		}
		hashmap.putIfAbsent(6, "Ctoc");
		System.out.println(" After invoking putIfAbsent() method");
		for(Map.Entry<Integer, String> entry:hashmap.entrySet()) {
			System.out.println(entry.getKey() +" "+ entry.getValue());
		}
	}
}

package assignment;

import java.util.HashMap;
import java.util.Set;

public class A53 {
	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("abc", 1);
		
		
		
		Set s = map.entrySet();
		
		System.out.println(s);
	}
}

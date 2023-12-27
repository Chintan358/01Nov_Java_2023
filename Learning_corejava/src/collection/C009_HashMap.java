package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class C009_HashMap {
	public static void main(String[] args) {
		
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(10, "Java");
		map.put(20, "Android");
		map.put(30, "SQL");
		map.put(40, "python");
		map.put(20, "ios");
		//System.out.println(map.get(30));
		//System.out.println(map);
		
//		Set s = map.entrySet();
//		Iterator itr = s.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
//		
		for(Entry<Integer, String> m : map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
	}
}

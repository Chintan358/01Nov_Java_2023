package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class C004_LinkedHAshset {
	
	public static void main(String[] args) {
		
		
		LinkedHashSet<String> set  = new LinkedHashSet<String>();
		set.add("Java");
		set.add("Php");
		set.add("SQL");
		set.add("Selenium");
		set.add("Java");
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}
}

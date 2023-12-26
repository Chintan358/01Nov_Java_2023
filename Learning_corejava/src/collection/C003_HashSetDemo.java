package collection;

import java.util.HashSet;

public class C003_HashSetDemo {
	public static void main(String[] args) {
		
		//initial size : 16
		//load factor : .75
		HashSet<String> set = new HashSet<String>();
		set.add("Java");
		set.add("Php");
		set.add("SQL");
		set.add("Selenium");
		set.add("Java");
		//set.add(10);
		
		for(String s:set)
		{
			System.out.println(s);
		}
		
		
	}
}

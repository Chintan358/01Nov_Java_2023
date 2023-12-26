package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class C004_Treeset {
	
	public static void main(String[] args) {
		
		
		TreeSet<String> set  = new TreeSet<String>();
		set.add("Java");
		set.add("SQL");
		set.add("Selenium");
		set.add("Php");
		set.add("Java");
		
		//Iterator<String> itr = set.iterator();
		Iterator<String> itr = set.descendingIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}
}

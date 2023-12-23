package collection;

import java.util.ArrayList;

public class C002_ArrayList {
	public static void main(String[] args) {
		
		
		ArrayList<String> sub = new ArrayList<String>();
		sub.add("Java");
		sub.add("python");
		sub.add("android");
		sub.add("Java");
		
		sub.add(null);
		
		ArrayList<String> sports = new ArrayList<String>(sub);
		sports.add("cricket");
		sports.add("Hockey");
		sports.addAll(sub);
		
		for(String s : sports)
		{
			System.out.println(s);
		}
		
		
		
	}
}

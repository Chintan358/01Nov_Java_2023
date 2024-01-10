package assignment;

import java.util.ArrayList;
import java.util.HashSet;

public class A52 {
	public static void main(String[] args) {
		
		
		HashSet<String> set = new HashSet<String>();
		set.add("java");
		set.add("android");
		set.add("php");
		
		String s[] = new String[3];
//		set.toArray(s);	
//		for(String str : s)
//		{
//			System.out.println(str);
//		}
		
		int count = 0;
		for(String str : set)
		{
			s[count] = str;
			count++;
		}
		
		ArrayList<String> al = new ArrayList<String>(set);
		
	}
}

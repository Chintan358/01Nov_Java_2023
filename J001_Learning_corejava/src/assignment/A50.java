package assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Random;

public class A50 {
	public static void main(String[] args) {
		
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(30);
		al.add(25);
		al.add(15);
		
		//Collections.sort(al);
		//Collections.shuffle(al);
		
		
		//Collections.swap(al, 0, 3);
		
//		Random r = new Random();
//		for(int i=al.size()-1;i>=0;i--)
//		{
//			Collections.swap(al, i, r.nextInt(i+1));
//		}
//		
		//System.out.println(al.subList(1, 3));
		Iterator<Integer> itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
//		ListIterator<Integer> itr = al.listIterator(al.size());
//		while(itr.hasPrevious())
//		{
//			System.out.println(itr.previous());
//		}
			
				
		
	}
}
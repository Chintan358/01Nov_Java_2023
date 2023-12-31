package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class C001_ArraylistDemo {
	public static void main(String[] args) {
		
		//default size : 10
		//new size = oldsize *3/2 + 1 = 16
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(101);
		al.add(20);
		al.add(301);
		al.add(40);
		al.add(50);
		al.add(601);
		al.add(70);
		al.add(80);
		al.add(90);
		al.add(100);
		al.add(110);
		
		//al.add(1,100);
		//al.remove(2);
		//al.set(1, 100);
		//System.out.println(al.size());
		//System.out.println(al.contains(40));
		
		
		//System.out.println(al.get(2));
//		for(int i :al)
//		{
//			System.out.println(i);
//		}
		
		Iterator<Integer> itr = al.iterator();
		while(itr.hasNext())
		{
			int i = itr.next();
			if(i%2==0)
			{
				itr.remove();
			}	
		}
		
		System.out.println(al);
		
	}
}

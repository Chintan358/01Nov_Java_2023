package assignment;

import java.util.ArrayList;

public class A51 {
	public static void main(String[] args) {
		
		
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(10);
		al1.add(20);
		al1.add(30);
		
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(10);
		al2.add(20);
		al2.add(60);
		
//		int flag = 0;
//		if(al1.size()!=al2.size())
//		{
//			System.out.println("not equal");
//		}
//		else
//		{
//			for(int i=0;i<al1.size();i++)
//			{
//				if(al1.get(i)!=al2.get(i))
//				{
//					flag = 1;
//					break;
//				}
//			}
//			if(flag==0)
//			{
//				System.out.println("Equal");
//			}
//			else
//			{
//				System.out.println("not equal");
//			}
//		}
		
		ArrayList<Boolean> al = new ArrayList<Boolean>();
		
		for(int i=0;i<al1.size();i++)
		{
			boolean b =  al1.get(i)==al2.get(i) ? true : false;
			
			 al.add(b);
		}
		
		System.out.println(al);
		
	}
}

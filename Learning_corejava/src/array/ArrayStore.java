package array;

import java.util.Arrays;

public class ArrayStore {
	public static void main(String[] args) {
		
		
		int a[] = {10,20,1,5,8,45,12};
		
		
		//Arrays.sort(a);
		
		//System.out.println(Arrays.toString(a));
		
//		for(int i=0;i<a.length;i++)
//		{
//			int temp = 0;
//			for(int j=i+1;j<a.length;j++)
//			{
//				if(a[i]>a[j])
//				{
//					temp = a[i];
//					a[i] = a[j];
//					a[j] = temp;
//				}
//			}
//			System.out.println(a[i]);
//		}
	
	
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
		
	
		
		
		
	}
}

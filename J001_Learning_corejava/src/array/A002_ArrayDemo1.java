package array;

import java.util.Scanner;

public class A002_ArrayDemo1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of an array : ");
		int size = sc.nextInt();
		int a[] = new int[size];
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println("enter value for index : "+i);
			a[i] = sc.nextInt();
		}
		
		
		for(int k :a)
		{
			System.out.println(k);
		}
		
	}
}

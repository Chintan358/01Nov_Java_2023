package assignment;

import java.util.Scanner;

public class A1 {
	public static void main(String[] args) {	
		String s;
		int sum = 0;
		do
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("enter number : ");
			s = sc.next();
		
			if(Character.isDigit(s.charAt(0)))
			{
			 int num =  Integer.parseInt(s);
			 sum = sum + num;
			}
			}while(!s.equals("x"));
			
			System.out.println(sum);
	}
}

package com;

public class Datatypes {
	public static void main(String[] args) {
		
		byte b = -128;
		short s = 32767;
		int i = 5656;
		long l = 56565656l;
		
		float f = 56.2256565456f;
		double d = 6565.565646565656;
		//System.out.println(f);
		///System.out.println(d);
		
		char c = 'A';
		boolean bool = true;
		
		char ch = 78;
		System.out.println(ch);
		int k = 'S';
		System.out.println(k);
		
		
		//typecastiong
		//widening - imlicite
		int x = 50; //4 byte
		long y = x; //8 byte
		
		
		//nerrowing - explicate
		long x1 = 4565;
		int y1 = (int) x1;
		
		
		
	}
}

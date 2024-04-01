package com;

import java.util.Random;

public class RandomNumber {
	public static void main(String[] args) {
		
		Random r = new Random();
		int num =  r.nextInt(1000, 9999);
		System.out.println(num);
		
	}
}

package com;

import org.springframework.stereotype.Component;

@Component("u2")
public class User2 implements User {

	@Override
	public void basicInfo() {
		System.out.println("name : Arun , Email : arun@gmail.com");

	}

}

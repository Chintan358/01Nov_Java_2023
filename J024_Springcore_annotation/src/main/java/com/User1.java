package com;

import org.springframework.stereotype.Component;

@Component("u1")
public class User1 implements User {

	@Override
	public void basicInfo() {
		System.out.println("name : Sahil , Email : Sahil@gmail.com");

	}

}

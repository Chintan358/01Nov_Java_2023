package com;

import org.springframework.stereotype.Component;

@Component
public class CurrentAccount implements Account {

	@Override
	public void getBalance() {
		System.out.println("Current account balance");

	}

	@Override
	public void deposite() {
		// TODO Auto-generated method stub

	}

	@Override
	public void withdrow() {
		// TODO Auto-generated method stub

	}

}

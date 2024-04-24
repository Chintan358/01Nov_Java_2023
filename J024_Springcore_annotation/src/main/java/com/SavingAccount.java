package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SavingAccount implements Account {

	@Autowired
	@Qualifier("u2")
	User user;
	
	@Override
	public void getBalance() {
		System.out.println("Saving account balance");
		user.basicInfo();
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

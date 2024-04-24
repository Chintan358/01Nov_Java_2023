package com;

import org.springframework.stereotype.Component;

@Component("loan")
public class LoanAccount implements Account {

	@Override
	public void getBalance() {
		System.out.println("Loan account balance");

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

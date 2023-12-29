package thread;

import java.util.Scanner;

class Account
{
	double balance;
	public Account(double balance) {
		// TODO Auto-generated constructor stub
		this.balance=balance;
	}
	
	
	public void withdraw(double amt)
	{
		if(amt>balance)
		{
			System.out.println("Reva de");
		}
		else
		{
			balance = balance-amt;
			System.out.println("Current balancer is : "+balance);
		}
	}
	
}

class Customer extends Thread
{
	Account a;
	String name;
	
	public Customer(Account a, String name) {
		this.a = a;
		this.name = name;
	}
	
	Scanner sc = new Scanner(System.in);
	public void run()
	{
		synchronized(a)
		{
		System.out.println("enter amount to withdraw : "+name);
		double amt = sc.nextDouble();
		a.withdraw(amt);
		}
	}
}

public class T005_BlockSync {
	public static void main(String[] args) {
		
		
		Account a1 = new Account(5000);
		
		Customer c1 = new Customer(a1,"Janak");
		Customer c2 = new Customer(a1,"Arun");
		
		c1.start();
		c2.start();
		
	}
}

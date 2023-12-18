package exeption;


class Bank
{
	double balance;
	
	public void getBalance()
	{
		System.out.println("current balance is : "+balance);
	}
	
	public void deposit(double amt)
	{
		balance += amt;
	}
	
	public void withdrow(double amt) throws InSufficientBalanceException
	{
		if(amt>balance)
		{
			//System.out.println("err");
			double need = amt-balance;
			throw new InSufficientBalanceException(need);
		}
		else
		{
			balance -=amt;
		}
	}
	
}

public class E003_CustomeException {
	public static void main(String[] args) {
		
		Bank b = new Bank();
		b.getBalance();
		
		b.deposit(5000);
		b.deposit(6000);
		
		b.getBalance();
	
		try {
			b.withdrow(11001);
		} catch (InSufficientBalanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.getmessage();
		}
		
		b.getBalance();
		
	}
}

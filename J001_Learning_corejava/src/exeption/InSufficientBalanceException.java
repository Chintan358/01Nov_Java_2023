package exeption;

public class InSufficientBalanceException extends Exception
{
	double need;
	public InSufficientBalanceException(double need) {
		// TODO Auto-generated constructor stub
		this.need = need;
	}
	
	public void getmessage()
	{
		System.err.println("You need more : "+need);
	}
}

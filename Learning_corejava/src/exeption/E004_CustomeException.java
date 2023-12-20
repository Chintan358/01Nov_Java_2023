package exeption;

class AgeInvalidException extends Exception
{
	int need;
	public AgeInvalidException(int need) {
		// TODO Auto-generated constructor stub
		this.need = need;
	}
	public void getMesaage()
	{
		System.err.println("need  : "+need);
	}
}

class AgeChecker
{
	public void age(int age) throws AgeInvalidException
	{
		if(age<18)
		{
			int need = 18-age;
			throw new AgeInvalidException(need);
		}
		else
		{
			System.out.println("Valid");
		}
	}
}

public class E004_CustomeException {
	public static void main(String[] args) {
		
		AgeChecker age = new AgeChecker();
		try {
			age.age(12);
		} catch (AgeInvalidException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.getMesaage();
		}
		
	}
}

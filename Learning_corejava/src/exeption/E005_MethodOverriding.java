package exeption;

import java.io.FileNotFoundException;

class Sample
{
	public void run() throws Exception
	{
		
	}
}

public class E005_MethodOverriding  extends Sample{

	@Override
	public void run() throws FileNotFoundException
	{
		
	}
	
}

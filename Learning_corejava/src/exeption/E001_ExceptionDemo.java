package exeption;



public class E001_ExceptionDemo {
	public static void main(String[] args)  {

		System.out.println("Program started");

		try 
		{
			int i = 10;
			int j = i / 0;
			System.out.println(j);
			
//			int a[] = new int[5];
//			a[6] = 40;
		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
		catch (ArithmeticException e)
		{
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		
		

		System.out.println("Program ended");

	}
}

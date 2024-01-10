package assignment;

public class A8 {
	public static void main(String[] args) {
		
		
		String str = "abcd@123 xyz";
		
		int letterCount = 0;
		int spaceCount = 0;
		int digitCount = 0;
		int otherCount = 0;
		
		
		for(int i=0;i<str.length();i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
				digitCount++;
			}
			else if(Character.isLetter(str.charAt(i)))
			{
				letterCount++;
			}
			else if(Character.isWhitespace(str.charAt(i)))
			{
				spaceCount++;
			}
			else
			{
				otherCount++;
			}
		}
		
		System.out.println("Space : "+spaceCount);
		System.out.println("Letter : "+letterCount);
		System.out.println("Digit : "+digitCount);
		System.out.println("special char : "+otherCount);
		
		
	}
}

package assignment;
class Demo
{
	public void stringcheck(String s)
	{
		for(int i=0;i<s.length();i++)
		{
			if(!Character.isLetter(s.charAt(i)) && !Character.isWhitespace(s.charAt(i)))
			{
				System.out.println(s.charAt(i));
			}
		}
	}
}

public class Q1 {
	public static void main(String[] args) {
		
		
		Demo d = new Demo();
		d.stringcheck("abc 123@");
		
	}
}

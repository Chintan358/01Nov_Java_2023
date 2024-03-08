package pettern;

public class P9 {
	public static void main(String[] args) {
		
		
//		0
//		10
//		010
//		1010
//		01010
		
		int lines = 5;
		int starCount = 1;
		for(int j=1;j<=lines;j++)
		{
			for(int i=1;i<=starCount;i++)
			{
				if(i%2 == j%2)
				{
					System.out.print("0");
				}
				else
				{
					System.out.print("1");
				}
				
			}
			System.out.println();
			starCount++;
		}
		
		
	}
}

package pettern;

public class P8 {
	public static void main(String[] args) {
		
		
//		*
//		##
//		*#*
//		####
//		*#*#*
		
		int lines = 5;
		int starCount = 1;
		for(int j=1;j<=lines;j++)
		{
			for(int i=1;i<=starCount;i++)
			{
				if(i%2==0 || j%2==0)
				{
					System.out.print("#");
				}
				else
				{
					System.out.print("*");
				}
				
			}
			System.out.println();
			starCount++;
		}
		
		
	}
}

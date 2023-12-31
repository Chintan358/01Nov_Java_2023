package impclasses;

public class I004_StringBuffer_Builder {
	public static void main(String[] args) {
		
		//syncronized
		double startTime = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer("Hello");
		for(int i=1;i<=1000000;i++)
		{
			sb.append("Java");
		}
		//System.out.println(sb);
		double endTime = System.currentTimeMillis();
		
		//asyncronyzed
		double startTime1 = System.currentTimeMillis();
		StringBuilder sb1 = new StringBuilder("Hello");
		for(int i=1;i<=1000000;i++)
		{
			sb1.append("Java");
		}
		//System.out.println(sb1);
		double endTime1 = System.currentTimeMillis();
		
		System.out.println("Time taken by buffer : "+(endTime-startTime));
		System.out.println("Time taken by builder : "+(endTime1-startTime1));
		
		
		
	}
}

import java.awt.Point;

class point
{
	public void Point(int x, int y)
	{
		 x = 10;
		 y = 20;
	}
}
public class PassbyReference {
	
	public static void main(String[] args) {
		
		Point p1 = new Point();
		p1.x = 1;
		p1.y = 2;
		
		System.out.println("X="+p1.x+"Y="+p1.y);
		
		change(p1);
		System.out.println("x="+p1.x+"Y="+p1.y);
		
	}
	
	public static void change(Point p)
	{ 
		p.x=5;
		p.y=55;	
	}

	
	
	
}

package oops;

class Shape
{
	public void findArea()
	{
		System.out.println("comman method for area finder...");
	}
}
class Circle extends Shape
{
	double r;
	Circle(double r)
	{
		this.r = r;
	}
	@Override
	public void findArea() {	
		double area = 3.14*r*r;
		System.out.println("Area of Circle is : "+area);
	}
}

class Square extends Shape
{
	double length;
	Square(double length)
	{
		this.length=length;
	}
	@Override
	public void findArea() {
		double area = length*length;
		System.out.println("Area of Square is : "+area);
	}
}

class Triangle extends Shape
{
	double base;
	double height;
	
	public Triangle(double base, double height) {
		
		this.base = base;
		this.height = height;
	}

	@Override
	public void findArea() {
		
		double area = 0.5 * base*height;
		System.out.println("Area of Triangle is : "+area);
	}
}


public class O012_ShapeArea {
	public static void main(String[] args) {
		
		Shape s = new Shape();
		s.findArea();
		Shape s1 = new Circle(12);
		s1.findArea();
		Shape s2 = new Square(10);
		s2.findArea();
		Shape s3 = new Triangle(10, 20);
		s3.findArea();
		
		
	}
}

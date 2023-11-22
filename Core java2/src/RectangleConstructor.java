class Rectangle
{
	double length, width;
	Rectangle()
	{
		System.out.println("Default constructor");
		length=	6;
		width=9;	
	}
	Rectangle(double w,double l)
	{
		System.out.println("Parameterised Constructor");
		width=w;
		length=l;
	}
	Rectangle(Rectangle r)
	{
		System.out.println("Copy Constructor");
		width=r.width;
		length=r.length;
		
	}
	void volume()
	{
		System.out.println("Volume : "+(2*(length+width)));
	}
	
}
public class RectangleConstructor 
{
public static void main(String[] args) {
	Rectangle r1=new Rectangle();
	r1.volume();
	Rectangle r2=new Rectangle(5,9);
	r2.volume();
	Rectangle r3=new Rectangle(r2);
	r3.volume();
}
}

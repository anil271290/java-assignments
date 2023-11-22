class Box
{
	double width,height,depth;
	//default constructor
	Box()
	{
		System.out.println("Default Constructor");
		width=3;
		height=4;
		depth=5;
	}
	//parameterized constructor
	Box(double w,double h,double d)
	{
		System.out.println("Parameterised Constructor");
		width=w;
		height=h;
		depth=d;
	}
	//copy constructor
	Box(Box b)
	{
		System.out.println("Copy Constructor");
		width=b.width;
		height=b.height;
		depth=b.depth;
		
	}
	void volume()
	{
		System.out.println("Volume : "+(width*height*depth));
	}
}

public class ConstructorDemo {
	public static void main(String[] args) {
		//default constructor
		Box b1=new Box();
		b1.volume();
		//parameterized constructor
		Box b2=new Box(4,5,9);
		b2.volume();
		//copy constructor
		Box b3=new Box(b1);
		b3.volume();
		
	}

}

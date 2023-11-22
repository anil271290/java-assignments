
public class StaticMethod {
	static int a = 10;
	static int b;

	static void math(int x) {
		System.out.println("X :" + x);
		System.out.println("A :" + a);
		System.out.println("B :" + b);
	}
	

	// below is a static block-called first before main method-highest priority
	static {
		System.out.println("Static Block Initialized");
		b = a * 4;
	}
	{
		System.out.println("Block 1");
	}

	public static void main(String[] args) {
		math(15);
		System.out.println("this is main method");
		StaticMethod s1=new StaticMethod();
	}
	public StaticMethod() {
		System.out.println("defult constructor");
	}
	{
		System.out.println("Block 3");
	}
	
}
//sequance of calling is 1.static block,2.main method,3.any other method that created,4.constructor
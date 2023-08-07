class A
{
	void showA()
	{
		System.out.println("I am class A");
	}
}
	class B extends A
	{
		void showB()
		{
			System.out.println("I am class B");
		}
	}
	class C extends B
	{
		void showC()
		{
			System.out.println("I am class C");
		}
	}

public class InheritanceDemo {
	public static void main(String[] args) {
		
	B b1=new B();
	C c1=new C();
	b1.showA();
	c1.showB();
	
		
	}

}

interface ifs1
{
	static void meth1()
	{
		System.out.println("Meth1");
	}
}
interface ifs2 extends ifs1
{
	void meth2();
}

class abs3 implements ifs2
{
	
	public void meth2() {
		
		System.out.println("Meth2 in Abs3");
	}
}
public class InterfaceDemo extends abs3 implements ifs1,ifs2
{
	
	public void meth1() {
		System.out.println("Meth1");
		
	}
	
	public void meth2() {
		System.out.println("Meth2");
		
	}

	public static void main(String[] args) {
		InterfaceDemo i=new InterfaceDemo();
		ifs1.meth1();
		i.meth2();
		abs3 a=new abs3();
		a.meth2();
	}

	
	

}

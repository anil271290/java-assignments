 import java.util.Scanner;

public class StaticVarible {
	static int a;
	void setvalue()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A: ");
		a=sc.nextInt();
	}
	void putvalue()
	{
		System.out.println("A : "+a);
	}
	public static void main(String[] args) {
		StaticVarible s1=new StaticVarible();
		StaticVarible s2=new StaticVarible();
		StaticVarible s3=new StaticVarible();
		
		s1.setvalue();
		s2.setvalue();
		s3.setvalue();
		
		s1.putvalue();
		s2.putvalue();
		s3.putvalue();
	}

}

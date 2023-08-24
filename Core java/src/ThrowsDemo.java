 import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowsDemo {
public static void demo()throws ArithmeticException,ArrayIndexOutOfBoundsException,InputMismatchException
{
	int x;
	Scanner sc=new Scanner(System.in);
	{
		
			System.out.println("Enter X : ");
			x=sc.nextInt();
			if(x>0)
			{
				System.out.println("Square of "+x+" Is "+(x*x));
			}
			else {
				throw new ArithmeticException();
				
			}
		
		}
	
	}
	public static void main(String[] args) {
		try
		{
			demo();
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Please enter Positive value only");
		}
	}
}


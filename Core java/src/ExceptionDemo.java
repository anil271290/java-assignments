import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {
	public static void main(String[] args) {
		System.out.println("Start code");
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter A : ");
			a=sc.nextInt();
			System.out.println("Enter B : ");
			b=sc.nextInt();
			c=a/b;
			System.out.println("Division : "+c);
			int arr[]= {1,2,3,4,5};
			System.out.println("Enter Index Number : ");
			int index=sc.nextInt();
			System.out.println(arr[index]);
		}
		catch (Exception e) {
			System.out.println(" Exception Caught");
		}
		/*catch (ArithmeticException e) {
			System.out.println("Exception Caught");
		}
		catch (InputMismatchException e) {
			System.out.println("Exception Caught");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception Caught");
		}*/
		System.out.println("Code End ");
		
	}

}

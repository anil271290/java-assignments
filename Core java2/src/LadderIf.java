import java.util.Scanner;

public class LadderIf {

     public static void main(String[] args) {
		int rno;
		String sname;
		int s1,s2,s3,total;
		double per;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter student name : ");
				sname=sc.next();
		System.out.print(" Enter Roll No : ");
				rno=sc.nextInt();
		System.out.print(" Enter marks of Subject 1 : ");
				s1=sc.nextInt();
		System.out.print(" Enter marks of Subject 2 : ");
				s2=sc.nextInt();
	    System.out.print(" Enter marks of Subject 3 : ");
			    s3=sc.nextInt();
			
			    total=s1+s2+s3;
			
			    per=total/3;
			
			System.out.println("Student Name :"+sname);
			System.out.println("Roll no :"+rno);
			System.out.println("Subject 1 :"+s1);
			System.out.println("Subject 2 :"+s2);
			System.out.println("Subject 3 :"+s3);
			System.out.println("Total :"+total);
			System.out.println("Percentage 1 :"+per);
			if(per>=70)
			{
				System.out.println("Distinction");
			}
			else if (per>=60) 
			{
				System.out.println(" First class");
				
				
			}
			else if (per>=50)
			{
				System.out.println(" Second class");
				
			}
			else if (per>=40) 
			{
				System.out.println(" Pass Class");
				
			}
			else {
				System.out.println("Fail");
			}
			}
}

import java.util.Scanner;

public class Arraydemo 
{
public static void main(String[] args) 
  {
	int i,j,temp,sum=0;
	int a[]=new int[5];
		
	Scanner sc= new Scanner(System.in);
	System.out.println(" Enter Array Elements ");
	for(i=0;i<a.length;i++)
	{
		System.out.println(" Enter "+i+" Element: ");
		a[i]=sc.nextInt();
		sum=sum+a[i];
	}
	System.out.println("Sum of Array Elements :"+sum);
	System.out.println("Average = "+sum/a.length);
	System.out.println(" Array elements are");
	for(i=0;i<a.length;i++)
	{
		   System.out.println("A["+i+"]= "+a[i]);
	}
	for(i=0;i<a.length;i++)
	{
		for(j=i+1;j<a.length;j++)
		{
		   if(a[i]>a[j])
		   {
			 temp=a[i];
			 a[i]=a[j];
			 a[j]=temp;
		   }
		}
	}
	System.out.println("Array Elements are in Aescending order");
	for(i=0;i<a.length;i++)
	{
		System.out.println("A["+i+"] = "+a[i]);
		//System.out.println("Average = "+sum/a.length);
	
	}
	
  
  }
}

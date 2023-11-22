
public class Diomandstar
{
	public static void main(String[] args) 
	{
	
		int i,j,k;
		   for(i=1;i<10;i++)
		   {
			   for(k=9;k>=i;k--)
			   {
				   System.out.print(" ");
			   }
			   
			   for(j=1;j<i;j++)
			   {
				   System.out.print("* ");	
			   }
			   
			   System.out.println();
		   }
			
		   for(i=1;i<10;i++)
		   {
			   for(k=1;k<=i-1;k++)
			   {
				   System.out.print(" ");
			   }
			   
			   for(j=i;j<10;j++)
			   {
				   System.out.print("* ");
			   }
			   
			   System.out.println();
		   }
		   
	}
	
	
}

import java.util.Scanner;
class Triangle
{
	public static void main(String []s)
	{
		int n,i,j;
		Scanner p=new Scanner(System.in);
		System.out.println("Enter a no ");
		n=p.nextInt();
			for(i=1;i<=n;i++)
			{
				for(j=1;j<=i;j++)
					
						System.out.print("*");
					
			
					System.out.println();
			}
	}
}
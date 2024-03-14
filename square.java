import java.util.Scanner;
class StarSquare
{
	public static void main(String []s)
	{
		int i,j,n;
		Scanner p=new Scanner(System.in);
		System.out.println("Enter the no");
		n=p.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)	
				System.out.print("*");
		
				System.out.println();
			
		}
	}
}
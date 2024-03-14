import java.util.Scanner;
class ReverseTriangle
{
	public static void main(String []s)
	{
		int i,j,n;
		Scanner p=new Scanner(System.in);
		System.out.println("Enter a no");
		n=p.nextInt();
			for(i=1;i<=n;i++)
			{
				for(j=i;j<=n;j++)
					System.out.print("*");
		
					System.out.println();
			}
	}
}
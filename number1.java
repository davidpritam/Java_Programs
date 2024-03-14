import java.util.Scanner;
class Number1
{
	public static void main(String []s)
	{
		int i,j,n;
		Scanner p=new Scanner(System.in);
		System.out.println("Enter a no");
		n=p.nextInt();
			for(i=n;i>=1;i--)
			{
				for(j=i;j<=n;j++)
					System.out.print(j);
					
					System.out.println();
			}
	}
}
					
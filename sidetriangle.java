import java.util.Scanner;
class SideTriangle
{
	public static void main(String []s)
	{
		int i,j,n;
		Scanner p=new Scanner(System.in);
		System.out.println("Enter a No");
		n=p.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n-i;j++)
				System.out.print(" ");
			for(j=1;j<=i;j++)
				System.out.print("* ");	
			System.out.println();
		}
	}
}
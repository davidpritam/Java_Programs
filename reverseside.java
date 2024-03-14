import java.util.Scanner;
class ReverseSidePattern
{
	public static void main(String []args)
	{
		int i,j,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a numnber");
		n=sc.nextInt();
			for(i=n;i>=1;i--)
			{
				for(j=1;j<=n-i;j++)
					System.out.print(" ");
				for(j=1;j<=i;j++)
					System.out.print("*");
						System.out.println();
			}
	}
}
				
				
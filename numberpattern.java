import java.util.Scanner;
class NumberPrint
{
	public static void main(String []s)
	{
		int i,j,n,d=1;
		Scanner p=new Scanner(System.in);
		System.out.println("Enter a no");
		n=p.nextInt();
			for(i=1;i<=n;i++)
			{
				for(j=1;j<=i;j++)
				{
					System.out.print(" "+j);
					
				}
					System.out.println();
			}
	}
}
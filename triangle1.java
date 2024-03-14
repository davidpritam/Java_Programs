import java.util.Scanner;
class NumberTriangle
{
	public static void main(String []s)
	{
		int i,j,n;
		Scanner p=new Scanner(System.in);
		System.out.println("Enter the no");
		n = p.nextInt();
			for(i=1;i<=n;i++)
			{
				for(j=i;j<=2*i-1;j++)
				{
		
				System.out.print(j);
				}
			
				System.out.println();
			}
	}
}
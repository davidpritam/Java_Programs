import java.util.Scanner;
class Triangle5
{
	public static void main(String []s)
	{
		int i,j,k,n;
		Scanner p=new Scanner(System.in);
		System.out.println("Enter a no");
		n=p.nextInt();
			for(i=1,k=1;i<=n;i++)
			{
				for(j=1;j<=i;j++)
				{
					System.out.print(k);
					k++;
				}
					
					System.out.println();
			}
	}
}
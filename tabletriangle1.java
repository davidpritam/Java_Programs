import java.util.Scanner;
class TableTriangle
{
	public static void main(String []args)
	{
		int i,j,n;
		Scanner p=new Scanner(System.in);
		System.out.println("Enter a no");
		n=p.nextInt();
			for(i=1;i<=n;i++)
			{
				for(j=i;j=2*j+1; j++)
					System.out.print(j);
		
						System.out.println();
			}
	}
}
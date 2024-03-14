import java.util.Scanner;
class StarNumberTriangle
{
	public static void main(String []args)
	{
		int i,j,n;
		Scanner p=new Scanner(System.in);
		System.out.println("Enter a number ");
		n=p.nextInt();
			for(i=1;i<=n;i++)
			{
				for(j=i;j<=2*i-1;j=j+2);
					System.out.print(j);

					System.out.println();
			}
	}
}
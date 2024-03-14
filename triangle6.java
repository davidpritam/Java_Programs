import java.util.Scanner;
class Triangle6
{
	public static void main(String []s)
	{
		int i,j,n;
		Scanner p=new Scanner(System.in);
		System.out.println("Enter a no");
		n=p.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=i;j<=i*i;j=j+i)
				System.out.print(j);
			
				System.out.println();
			
		}
	}
}
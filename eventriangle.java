import java.util.Scanner;
class EvenTriangle
{
	public static void main(String []s)
	{
		int i,j,n;
		Scanner p=new Scanner(System.in);
		System.out.println("Enter the no");
		n=p.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=2;j<=2*i;j=j+2)	
				System.out.print( j );
		
				System.out.println();
			
		}
	}
}
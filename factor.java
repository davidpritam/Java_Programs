import java.util.Scanner;
class FindFactor
{
	public static void main(String []s)
	{
		int i,n;
		boolean b=false;
		Scanner p=new Scanner(System.in);
		System.out.println("Enter the no ");
		n=p.nextInt();
		for(i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				System.out.println(i);
			}
			
		}
	}
}
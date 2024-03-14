import java.util.Scanner;
class PrintPrime
{
	public static void main(String []args)
	{
		int i,n;
		boolean p=false;
		Scanner t=new Scanner(System.in);
		n=t.nextInt();
			for(i=1;i<=n;i++)
			{
			for(i=2;i<=n/2;i++)
			{
				if(n%i==0)
				{
					p=true;
					break;
				}
			}
					if(p==false)
						System.out.println(i);
					else
						System.out.println("No Prime");
			}
	}
}
					
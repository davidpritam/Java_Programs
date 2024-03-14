import java.util.Scanner;
class GetPrime
{
	public static void main(String args[])
	{
		int i=2,n,count=0;
		boolean f;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no ");
		n=sc.nextInt();
		while(true)
		{
			f=isPrime(i);
			if(f==true)
			{
				count++;
				System.out.print(i+" ");
			}
			if(count==n)
				break;
			
			i++;
	}
				
		}
	static boolean isPrime(int x)
	{
		int i;
		for(i=2;i<=x/2;i++)
		{
			if(x%i==0)
				return false;
		}
		return true;
	}
}
			
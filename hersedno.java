import java.util.Scanner;
class HersedNo
{
	public static void main(String []s)
	{
		int n,sum=0,d,t;
		Scanner p=new Scanner(System.in);
		System.out.println("Enter a no ");
		n=p.nextInt();
		t=n;
			while(n>0)
			{
				d=n%10;
				sum=sum+d;
				n=n/10;
			}
				if(t%sum==0)
					System.out.println("The no is HERSESD ");
				else
					System.out.println("The no is not HERSED ");
	}
}
			
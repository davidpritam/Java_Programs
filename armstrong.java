import java.util.Scanner;
class Armstrong
{
	public static void main(String []args)
	{
		int n,d,t,count=0;
		int sum=0;
		Scanner p=new Scanner(System.in);
		System.out.println("Enter the no");
		n=p.nextInt();
		t=n;
			while(n>0)
			{
				count++;
				n=n/10;
			}
				n=t;
				while(t>0)
				{
					d=t%10;
					sum=sum+(int) (Math.pow(d,count));
					t=t/10;
				}
					if(n==sum)
						System.out.println("Armstrong No");
					else 
						System.out.println("Not Armstrong No");
	}
}
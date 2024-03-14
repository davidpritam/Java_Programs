import java.util.Scanner;
class Emirp
{
	public static void main(String []args)
	{
		int c1,c2,n,r,t;
		Scanner p=new Scanner(System.in);
		System.out.println("Enter a No ");
		n=p.nextInt();
		t=n;
		c1=isPrime(n);
		r=reverse(n);
		c2=isPrime(r);
			if(c1==2 && c2==2)
				System.out.println(t+" Is Emirp No");
			else
				System.out.println("Not Emirp No");
	}
				static int isPrime(int x)
					{
						int i,c=0;
						for(i=1;i<=x;i++)
						{
							if(x%i==0)
							c++;
						}
							return c;
					}
				
				static int reverse(int x)
					{
						int d,r=0;
							while(x>0)
							{
								d=x%10;
								r=r*10+d;
								x=x/10;
							}
								return r;
					}
			
		
		
}
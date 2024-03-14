import java.util.Scanner;
class reverse
{
	public static void main(String []args)
	{
		int n,d,r=0,t;
		Scanner p=new Scanner(System.in);
		System.out.println("Enter a no");
		n=p.nextInt();
		t=n;
			while(n>0)
			{
				d=n%10;
				r=r*10+d;
				n=n/10;
			}
				System.out.println("Reverse No Is " +r);
				if(t==r)
					System.out.println("The no is PALLINDROME");
				else
					System.out.println("The no is not PALLINDROME");
	}
}
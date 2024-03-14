import java.util.Scanner;
class PetersonNo
{
	public static void main(String []args)
	{
		int n,k,d,f,sum=0;
		System.out.println("Enter the no");
		Scanner p=new Scanner(System.in);
		n =p.nextInt();
		k=n;
		while(n>0)
		{
			d=n%10;
			f=fact(d);
			sum=sum+f;
			n=n/10;
		}
			if(k==sum)
				System.out.println(k+"is a peterson no");
			else
				System.out.println(k+"is not peterson no");
	}

		static int fact(int x)
		{
			int f=1,i;
			for(i=1;i<=x;i++)
				f=f*i;
			return f;
		}
}
		
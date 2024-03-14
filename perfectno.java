import java.util.Scanner;
class PerfectNumber
{
	public static void main(String []args)
	{
		int n,i,sum=0;
		Scanner p=new Scanner(System.in);
		System.out.println("Enter a no to find perfect no");
		n=p.nextInt();
			for(i=1;i<=n/2;i++)
			{
				if(n%i==0)
					sum=sum+i;
			}
					if(n==sum)
						System.out.println("Perfect No");
					else 
						System.out.println("Not Perfect No");
	}
}	

				
								
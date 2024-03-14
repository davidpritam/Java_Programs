import java.util.Scanner;
class prime1
{
	public static void main(String []s)
	{
		Scanner p=new Scanner(System.in);
		int n,i,count=0J;
		System.out.println("Enter the no");
		n=p.nextInt();
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
			count++;
		}
				if(count==2)
					System.out.println( n  +"  Is prime no   ");
				else
					System.out.println( n  +"  Is composite no ");
	}
}
	
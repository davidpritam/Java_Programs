import java.util.Scanner;
class ContinueAdd
{
	public static void main(String []s)
	{
		Scanner p=new Scanner(System.in);
		int sum=0;
		System.out.println("Enter the size");
		int n=p.nextInt();
		System.out.println("Enter the "+n+" values");
		for(int i=1;i<=n;i++)
		{
			int x=p.nextInt();
			if(x<0)
				continue;
				sum=sum+x;
		}
		System.out.println("sum is "+sum);
	}
}
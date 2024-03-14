import java.util.Scanner;
class DecimalToBinary
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no");
		int n=sc.nextInt();
		int i=0,rem;
		int a[]=new int[32];
		while(n>0)
		{
			rem=n%2;
			a[i]=rem;
			i++;
			n=n/2;
		}
		for(int j=i-1;j>=0;j--)
		{
			System.out.print(a[j]+" ");
		}
	}
}
		
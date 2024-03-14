import java.util.Scanner;
class factorial
{
	public static void main(String []args)
	{
		Scanner p=new Scanner(System.in);
		int a=1,i,n;
		System.out.println("Enter the no ");
		n=p.nextInt();
		if(n<0)
		{
			System.out.println("Invalid Input");
			System.exit(0);
		}
			for(i=1;i<=n;i++)
				a=a*i;
				System.out.println("factorial is "+ a);
	}
}

		
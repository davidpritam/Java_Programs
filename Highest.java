import java.util.Scanner;
class greatest
{
	public static void main(String []args)
	{
		int a,b,c;
		Scanner n=new Scanner(System.in);
		System.out.println("Enter the first number");
		a=n.nextInt();
		System.out.println("Enter the second number");
		b=n.nextInt();
		System.out.println("Enter the third number");
		c=n.nextInt();
		if(a>b)
		{
			if(a>c)
				System.out.println(a +" is greatest");
			else
				System.out.println(c +" is greatest");
		}
			else 
			{
				if (b>c)
					System.out.println(b +" is greatest");
				else
					System.out.println(c +" is greatest");
			}
	}
}

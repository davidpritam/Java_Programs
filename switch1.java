import java.util.Scanner;
class Switch1
{
	public static void main(String []s)
	{
		int x,a,b,res;
		Scanner p=new Scanner(System.in);
		System.out.println("Enter the first value");
		a=p.nextInt();
		System.out.println("Enter the second value");
		b=p.nextInt();
		System.out.println("Enter Your .choice");
		x=p.nextInt();
		switch(x)
		{
			case 1:	
				res=a+b;
				System.out.println("sum is "+res);
				//break;
			case 2:
				res=a-b;
				System.out.println("difference is "+res);
				//break;
			case 3:
				res=a*b;
				System.out.println("multiply is "+res);
				break;
			case 4:
				if(b!=0)
				{
					res=a/b;
					System.out.println("Quotient is "+res);
				}
				else
					System.out.println("Can't divide by 0");
					break;
			default:
				System.out.println("Invalid Choice");

		}
	}
}	
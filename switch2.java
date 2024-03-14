import java.util.Scanner;
class Switch2
{
	public static void main(String []s)
	{
		int  x;
		int a,b,res;
		Scanner p=new Scanner(System.in);
		System.out.println("Enter the first value");
		a=p.nextInt();
		System.out.println("Enter the second value");
		b=p.nextInt();
		System.out.println("Enter Your .choice");
		x=p.nextInt();
		switch(x)
		{
			case 'b'-'a':	
				res=a+b;
				System.out.println("sum is "+res);
				
			case 2:
				res=a-b;
				System.out.println("difference is "+res);
				
			default:
				System.out.println("Invalid Choice");
			case 3:
				res=a*b;
				System.out.println("multiply is "+res);
				break;
			case 2+2:
				if(b!=0)
				{
					res=a/b;
					System.out.println("Quotient is "+res);
				}
				else
					System.out.println("Can't divide by 0");
					break;
			

		}
	}
}	
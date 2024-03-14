import java.util.Scanner;
class SwitchWithString
{
	public static void main(String []s)
	{
		char x;
		String str;
		int a,b,res;
		Scanner p=new Scanner(System.in);
		System.out.println("Enter first no");
		a=p.nextInt();
		System.out.println("Enter second no");
		b=p.nextInt();
		System.out.println("Enter your choice");
		str=p.next();
		x=str.charAt(0);
		switch(x)
		{
			case 'a':
			case 'A':
				res=a+b;
				System.out.println("sum is "+res);
				break;
			case 'B':
			case 'b':
				res=a-b;
				System.out.println("difference is "+res);
				break;
			case 'C':
			case 'c':
				res=a*b;
				System.out.println("multiply is "+res);
				break;
			case 'D':
			case 'd':
				if(b!=0)
				{
					res=a/b;
					System.out.println(" Quotient is "+res);
				}
				else
					System.out.println("Can't divide by ");
					break;
			default:
				System.out.println("Invalid choice");
		}
	}
}
import java.util.Scanner;
class SwitchUsingString
{
	public static void main(String []s)
	{
		int a,b,res;
		String str;
		Scanner p=new Scanner(System.in);
		System.out.println("----------Menu------------");
		System.out.println("         1:- ADD  ");
		System.out.println("         2:- SUB  ");
		System.out.println("         3:- MULT ");
		System.out.println("         4:- DIV  ");
		System.out.println("Enter Your choice ");
		str=p.nextLine();
		str=str.toUpperCase();
		System.out.println("Enter Your First No");
		a=p.nextInt();
		System.out.println("Enter Your Second No");
		b=p.nextInt();
		switch(str)
		{
			case "ADD":
				res=a+b;
				System.out.println("Addition is "+res);
				break;
			case "SUB":
				res=a-b;
				System.out.println("Difference is "+res);
				break;
			case "MULT":
				res=a*b;
				System.out.println("Addition is "+res);
				break;	
			case "DIV":
				if(b!=0)
				{
					res=a/b;
					System.out.println("Quotient is "+res);
				}
				else
					System.out.println("Division is not possible");
					break;
			default:
				System.out.println("Invalid choice ");
		}	
	}
}
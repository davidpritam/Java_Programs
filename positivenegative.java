import java.util.Scanner;
class PosNegZero
{
	public static void main(String []args)
	{
	int no;
	Scanner p=new Scanner(System.in);
	System.out.println("Enter a number");
	no=p.nextInt();
	if(no>0)
	System.out.println(no+ "is Positive");
	else if(no<0)
	System.out.println(no+ "is Negative");
	else
	System.out.println(no+ "is Zero");
	}
}
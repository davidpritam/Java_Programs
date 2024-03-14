import java.util.Scanner;
class swap
{
	public static void main(String []args)
	{
	int a,b,c;	
	Scanner p=new Scanner(System.in);
	System.out.println("Enter the value of a and b ");
	a=p.nextInt();
	b=p.nextInt();
	c=a;
	a=b;
	b=c;
	System.out.println("The value of a is" +a + "and" +b);
	}
}
	
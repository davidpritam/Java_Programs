import java.util.Scanner;
class swap1
{
	public static void main(String []args)
	{
	int a,b;
	Scanner p=new Scanner(System.in);
	System.out.println("Enter the value of a and b");
	a=p.nextInt();
	b=p.nextInt();
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("swap of a is " +a +" swap of and b is " +b);
	}
}

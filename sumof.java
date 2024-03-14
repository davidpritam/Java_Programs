import java.util.Scanner;
class SumOfTwo
{
	public static void main(String []s)
	{
		int a,b,c;
		Scanner p=new Scanner(System.in);
		System.out.println("Enter two number");
		a=p.nextInt();
		b=p.nextInt();
		c=a+b;
		System.out.println("sum of two no is " + (c));
	}
}
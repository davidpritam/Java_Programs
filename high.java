import java.util.Scanner;
class higher
{
	public static void main(String []s)
	{
	Scanner p=new Scanner(System.in);
	int a,b,c,m;
	System.out.println("Enter the three numbers");
	a=p.nextInt();
	b=p.nextInt();
	c=p.nextInt();
		m=(a>b)?(a>c?a:c):(b>c?b:c);
		System.out.println(m +" Is greatest");
	}
}
		
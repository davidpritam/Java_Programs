import java.util.Scanner;
class highest
{
	public static void main(String []args)
	{
		int a,b,c;
		Scanner p=new Scanner(System.in);
		System.out.println("Enter the three numbers");
		a=p.nextInt();
		b=p.nextInt();
		c=p.nextInt();
		if (a>b)
		{
			if (a>c)
				System.out.println(a + "is greatest");
			else
				System.out.println(c + "is greatest");
		}
		else 
		{
			if(b>c)
				System.out.println(b +"is greatest");
			else 
				System.out.println(c + "is greatest");
		}
	}
}

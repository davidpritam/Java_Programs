import java.util.Scanner;
class age
{
	public static void main(String []s)
	{
		int a;
		Scanner p=new Scanner(System.in);
		System.out.println("Enter Your age");
		a=p.nextInt();
		if(a>=18)
			System.out.println("You are an Adult");
		else 
			System.out.println("You are Minor");
	}
}
	
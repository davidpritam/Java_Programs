import java.util.Scanner;
class StringInput
{
	public static void main(String []s)
	{
		String x,y;
		Scanner p=new Scanner(System.in);
		System.out.println("Enter a sentence");
		x=p.next();
		y=p.nextLine();
		System.out.println(x);
		System.out.println("    "+y);
	}
}
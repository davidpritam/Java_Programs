import java.util.Scanner;
class TakingInputString
{
	public static void main(String []s)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Srting");
		String name= sc.nextLine();
		System.out.println("your string is "+name);
	}
}
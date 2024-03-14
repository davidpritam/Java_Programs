import java.util.Scanner;
class StringTestCase
{
	public static void main(String []s)
	{
		String str,ch;
		//char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		str=sc.nextLine();
		System.out.println("Enter a new character");
		ch=sc.next();
		System.out.println(str);
		System.out.println(ch);	
	}
}
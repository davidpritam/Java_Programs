import java.util.Scanner;
class StringCompareTo
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first String");
		String str=sc.nextLine();
		System.out.println("Enter second String");
		String str1=sc.nextLine();
		System.out.println("Your entered string is "+str);
		System.out.println("Your second string is  "+str1);
		int x=str.compareTo(str1);
		System.out.println(x);
		int y=str1.compareTo(str);
		System.out.println(y);
	}
}
		
		
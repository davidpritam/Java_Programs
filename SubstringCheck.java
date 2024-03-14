import java.util.Scanner;
class SubstringCount
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		int count=0;
		String str,str1;
		str=sc.nextLine();
		System.out.println("Enter a substring");
		str1=sc.nextLine();
		System.out.println(str1);
		System.out.println(str);
		String s=new String(str1);
		boolean y=str.contains(str1);
		
		while(y!=true)
		{
		
		count++;
		System.out.println(count);
		}
	}
}
		
		
		
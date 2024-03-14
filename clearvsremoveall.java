import java.util.ArrayList;
import java.util.Scanner;
class ClearVsRemoveAll
{
	public static void main(String []s)
	{
		ArrayList<Integer> a1=new ArrayList<Integer>();
		ArrayList<Integer> a2=new ArrayList<Integer>();
		Scanner p=new Scanner(System.in);
		System.out.println("How many No You want to print");
		int n1=p.nextInt();
		System.out.println("Enter the "+n1+" values");
		for(int i=0;i<n1;i++)	
		{
			int x=p.nextInt();
			a1.add(x);
		}
		System.out.println(a1);
		System.out.println("How many value you want to print");
		int n2=p.nextInt();
		System.out.println("Enter the "+n2+" values");
		for(int i=0;i<n2;i++)
		{
			int y=p.nextInt();
			a2.add(y);
		}
		System.out.println(a2);
		a1.removeAll(a2);
		System.out.println(a1);
		System.out.println(a2);
	}
}
	
		
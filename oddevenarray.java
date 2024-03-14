import java.util.ArrayList;
import java.util.Scanner;
class TakingEvenOdd
{
	public static void main(String []s)
	{
		ArrayList<Integer> a1=new ArrayList<Integer>();
		ArrayList<Integer> a2=new ArrayList<Integer>();
		Scanner p=new Scanner(System.in);
		System.out.println("How many Even no You want to print");
		int n1=p.nextInt();
		System.out.println("Enter the "+n1+" values");
		for(int i=0;i<n1;i++)
		{
			int x=p.nextInt();
			if(x%2==0)
				a1.add(x);
			else
			{
				System.out.println("Not Even No");
				i--;
			}
		}
		System.out.println("The even No are "+a1);
		System.out.println("How many Odd values you want to print");	
		int n2=p.nextInt();
		System.out.println("Enter the "+n2+" values");
		for(int i=0;i<n2;i++)
		{
			int y=p.nextInt();
			if(y%2!=0)
				a2.add(y);
			else
			{
				System.out.println("Not Odd no");
				i--;
			}
		}
		System.out.println("The Odd No are "+a2);
		a1.addAll(a2);
		System.out.println("The array after merging are "+a1);
		System.out.println("Size of array after merge is "+a1.size());
		System.out.println(a2);
	}
}
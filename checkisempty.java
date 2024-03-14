import java.util.List;
//import java.util.ArrayList;
import java.util.Scanner;
class ArrayToArray1
{
	public static void main(String []s)
	{
		int x;
		ArrayList<Integer> a=new ArrayList<Integer>();
		Scanner p=new Scanner(System.in);
		System.out.println("How many value You want to print");
		int n=p.nextInt();
		System.out.println("Enter the "+n+" values");
		for(int i=0;i<n;i++)
		{
			x=p.nextInt();
			a.add(x);
		}
			for(int i:a)
			System.out.print(i+" ");
			System.out.println();
			Collection.sort(a);

		System.out.println(a.isEmpty());
		a.clear();
		System.out.println(a.isEmpty());
	}
}		 
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
class CollectionList
{
	public static void main(String []s)
	{
		List<Integer> a=new ArrayList<Integer>();
		Scanner p=new Scanner(System.in);
		System.out.println("How many value you want to print");
		int n=p.nextInt();
		System.out.println("Enter the "+n+" values");
		for(int i=0;i<n;i++)
		{
			int x=p.nextInt();
			a.add(x);
		}
			System.out.println("The values after input are");
			System.out.println(a);
		
			Collections.sort(a);
			System.out.println("The arraylist after collection sort are");
			System.out.println(a);
			Collections.sort(a,Collections.reverseOrder());
			System.out.println("The reverse order are");
			System.out.println(a);
	}
}
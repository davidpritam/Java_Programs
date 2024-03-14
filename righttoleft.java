import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
class LeftToRightEvenRightToLeftOdd
{
	public static void main(String []s)
	{
		int i;
		Scanner p=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int n=p.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the "+n+" values");
		for(i=0;i<a.length;i++)
		{
			a[i]=p.nextInt();
		}
		for(i=0;i<a.length;i++)
		System.out.print(a[i]+" ");
		ArrayList<Integer> a1=new ArrayList<>();
		ArrayList<Integer> a2=new ArrayList<>();
		for(i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
				a1.add(a[i]);
			else
				a2.add(a[i]);
		}
			System.out.println(a1);
			System.out.println(a2);
			Collections.sort(a1);
			Collections.sort(a2,Collections.reverseOrder());
			a1.addAll(a2);
			System.out.println(a1);
			Integer arr[]=new Integer[a1.size()];
			arr=a1.toArray(arr);
			for(int j:arr)
			System.out.print(j+" ");
	}
}
		
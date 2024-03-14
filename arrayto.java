import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
class ArrayToArrayListData
{
	public static void main(String []s)
	{
		int i;
		Scanner p=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=p.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the "+n+" values");
		for(i=0;i<a.length;i++)
			a[i]=p.nextInt();

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
	}
}
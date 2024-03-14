import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
class SelectOddEvenArray
{
	public static void main(String []s)
	{
		
		Scanner p=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=p.nextInt();
		Integer a[]=new Integer[n];
		System.out.println("Enter the "+n+" Elements");
		for(int i=0;i<n;i++)
		{
			a[i]=p.nextInt();
		}
		
		for(int i=0;i<n;i++)
		System.out.println(" "+a[i]);
		
		ArrayList<Integer> a1=new ArrayList<>(Arrays.asList(a));

		System.out.println(a1);
		ArrayList<Integer> a2=new ArrayList<>(Arrays.asList(a));
		System.out.println(a2);
		
	}
}
		
		
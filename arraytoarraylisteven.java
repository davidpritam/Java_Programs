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
		int a=p.nextInt();
		int n[]=new int[a];
		System.out.println("Enter the "+a+" values");
		for(i=1;i<a;i++)
		{
			n[i]=p.nextInt();
		}
			System.out.println(n[i]);
	}
}
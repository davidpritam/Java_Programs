import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
class ArrayToArrayList
{
	public static void main(String []s)
	{
		Integer a[]=new Integer[]{3,4,5,6,18};
		ArrayList<Integer> p=new ArrayList<>(Arrays.asList(a));
		
			System.out.println(p);
			for(int i=0;i<5;i++)
				System.out.print(" "+a[i]);
	}
}
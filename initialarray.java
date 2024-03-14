import java.util.Scanner;
import java.util.ArrayList;
class InitializationOfArrayList
{
	public static void main(String []s)
	{
		ArrayList<Integer> p=new ArrayList<>()
		{
			{
				add(9);
				add(12);
				add(3);
			}
		};
		System.out.println(p);
	}
}
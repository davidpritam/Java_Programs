import java.util.ArrayList;
import java.util.Scanner;
class StringArrayList
{
	public static void main(String []s)
	{
		ArrayList<String> p=new ArrayList<>()
		{
			{
				add("Ram");
				add("Manohar");
				add("Lohiya");
			}
		};
		System.out.println(p);
	}
}
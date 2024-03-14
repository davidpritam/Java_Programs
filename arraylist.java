import java.util.ArrayList;
class ArrayListTest
{
	public static void main(String []s)
	{
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(15);
		a.add(2);
		a.add(22);
		//void add(Element e)
		//void add(index i,Element e)
		a.add(3,30);
		//a.clear();
		a.remove(1);
		System.out.println("the size of array is "+a.size());
		System.out.println("The ArrayList is "+a);
		boolean b=a.contains(2);
		if(b==true)
			System.out.println("Found ");
		else
			System.out.println("Not Found");
			System.out.println(a.get(0));
			System.out.println(a.indexOf(2));
			System.out.println(a.indexOf(24));
	}
}
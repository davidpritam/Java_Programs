class ArrayCheck
{
	public static void main(String []s)
	{
		int a[]=new int []{5,10,15,20,25};
		int i=0;
		System.out.println(a[i]);
		System.out.println(a[++i]);
		System.out.println(++a[i]);
		System.out.println(++a[++i]);
			for(i=0;i<a.length;i++)
				System.out.print(a[i]+"  ");
	}
}
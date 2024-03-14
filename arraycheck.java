class ArrayLength
{
	public static void main(String []s)
	{
		boolean a[]=new boolean[-5];
		for(int i=0; i<a.length; i++)
			System.out.println(a[i]+"  ");
	}
}
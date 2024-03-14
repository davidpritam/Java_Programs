class Increment3
{
	public static void main(String []s)
	{
		int x=20,a;
		a=(++x * x++ - x++ + ++x);
		System.out.println(a);
	}
}

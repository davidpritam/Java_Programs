class Increment1
{
	public static void main(String []args)
	{
		int a,x=10;
		a = (++x + x++ + ++x);
		System.out.println(a);
	}
}
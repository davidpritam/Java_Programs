class Increment
{
	public static void main(String []args)
	{
		int x=10,a;
		a=x++ + x++;
		System.out.println("value of a is "+a);//first value of x is stored in somewhere in memory after that value of x is stored in somewhereelse in memory:
		System.out.println("value of x is "+x);//first x=10 and x= 11 is added:
	}
}
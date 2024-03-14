class Equal
{
	public static void main(String []s)
	{
		int a=10,b=9;
		if(a++ == ++b)
			System.out.println("True");
		else 
			System.out.println("False");
	}
}
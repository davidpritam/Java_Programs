class DivisionDemo
{
	public static void main(String[]args)
	{
		//System.out.println(15/0);  ArithmeticException
		System.out.println(15/0.0); //Infinity
		System.out.println(-15/0.0);-Infinity
		System.out.println(0.0/0.0);NaN
	}
}
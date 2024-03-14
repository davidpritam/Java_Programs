class Addition1
{
	public static void main(String []s)
	{
		Addition1 a=new Addition1();
		a.sum(10,20);
		a.sum(10.0,20.0);
	}
	void sum(int x,int y)
	{
		System.out.println("With 2 int");
		int s=x+y;
		System.out.println("Sum is "+s+"\n");
	}
	void sum(double a,double b)
	{
		System.out.println("With 2 double");
		double s=a+b;
		System.out.println("Sum is "+s+"\n");
	}
	
	
}
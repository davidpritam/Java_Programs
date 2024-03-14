class A
{
	int x,y;
	static int p,q;
	static void sum()
	{
		int s=p+q;
		System.out.println("Sum is "+s);
	}
	void product()
	{
		int m=p*q*x*y;
		System.out.println("The product is "+m);
	}
	public static void main(String []args)
	{
		p=4;
		q=5;
		sum();
		A obj=new A();
		obj.x=5;
		obj.y=5;
		obj.product();
	}
}
class A
{
	int x,y;
	static int p,q;
	static void sum()
	{
		int s=p+q;
		System.out.println("The sum is "+s);
	}
	void product()
	{
		int m=p*q*x*y;
		System.out.println("The product is "+m);
	}
	A(int i,int j)
	{
		x=i;
		y=j;
	}
}
class B
{
	public static void main(String []args)
	{
		A.p=5;
		A.q=10;
		A.sum();
		A obj=new A(2,4);
		obj.product();
	}
}
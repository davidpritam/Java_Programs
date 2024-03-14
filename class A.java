class A
{
	int x,y;
	static int p;
	void sum()
	{
		int s=x+y+p;
		System.out.println(s);
	}
	public static void main(String []args)
	{
		p=18;
		System.out.println("p= "+p);
		A obj=new A();
		A obj1=new A();
		obj.x=4;
		obj.y=5;
		System.out.println("x= "+obj.x);
	}
}
class A
{
	int x,y;
	static int p;
	/*static void sum()
	{
		int s=x+y+p;
		System.out.println(s);
	}*/
}
class B
{
	int m,n;
	static int q;
	public static void main(String []args)
	{
		q=20;
		A.p=10;
		A obj=new A();
		A obj1=new A();
		obj.x=4;
		obj.y=5;
		obj1.p=obj.p+A.p;
		System.out.println("A.p= "+A.p);
		System.out.println("q= "+q);
	}
}
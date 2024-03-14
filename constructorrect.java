class Rect
{
	int l,b;
	void area()
	{
		
		int a=l*b;
		System.out.println("Area is "+a);
		
	}
	void peri()
	{
	
		int p=(2*(l+b));
		System.out.println("Perimeter is "+70);
	}
	public static void main(String []s)
	{
		Rect r1=new Rect(10,20);
		Rect r2=new Rect();
		r1.area();
		r1.peri();
	}
	Rect(int x,int y)
	{
		System.out.println("Constructor Called");
		l=x;
		b=y;
	}
}
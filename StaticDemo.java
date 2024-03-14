		//Declaring a static variable in a class and using it in another class 
class A
{
	int x,y;
	static int p;
	/*static void sum()
	{
		int s=x+y+p;
		System.out.println("The sum is "+s);
	}*/
}
class B
{
	int m,n;
	static int q;
	public static void main(String s[])
	{
		q=20;//static variable p of class B
		A.p=15;//static variable used with class name
		A obj=new A();
		A obj1=new A();
		obj.x=4;//Instance variable used with object name
		obj.y=9;
		obj1.p=obj.p+A.p;
		System.out.println("A.p= "+A.p);
		System.out.println("q= "+q);
	}
}
/* If a static variable is declared in class M and it is used in class N, then in class N, the static variable must be used with the class name , i.e., as M.variable*/	








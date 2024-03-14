class Addition
{
	public static void main(String []s)
	{
		Addition a=new Addition();
		a.sum(15.2,8);
		a.sum(17,12,35);
		a.sum(10,19);	
		a.sum(6,26.1);
	}
	void sum(int x,int y)
	{
		System.out.println("With 2 int");
		int s=x+y;
		System.out.println("Sum is "+s+"\n");
	}
	void sum(int a,double b)
	{
		System.out.println("With int ,double");
		double s=a+b;
		System.out.println("Sum is "+s+"\n");
	}
	void sum(int q,double p)
	{
		System.out.println("double and int");
		double s=p+q;
		System.out.println("sum is "+s+"\n");
	}
	void sum(int i,int j,int k)
	{
		System.out.println(" with 3 int");
		int p=i+j+k;
		System.out.println("sum is "+p+"\n");
	}
}
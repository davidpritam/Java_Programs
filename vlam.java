class VLAM
{
	public static void main(String []s)
	{
		SumOfArray(5,10,15);
		SumOfArray(8,2,3,15,7,4);
		SumOfArray(6,10);
		SumOfArray();
	}
	static void SumOfArray(int...x)
	{
		int sum=0;
		for(int i:x)
		sum=sum+i;
		
		System.out.println("Sum is "+sum);
	}
}
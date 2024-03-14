class EnhancedForLoop
{
	public static void main(String[]s)
	{
		int a[]=new int[]{5,10,15,20,25};
		int sum=0;
		for(int i : a)
		{
			sum=sum+i;
		}
		System.out.println(sum);
	}
}

	
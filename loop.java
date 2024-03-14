class Loop
{
	public static void main(String []s)
	{
		for(int i=0,j=0; i<5 || j<5; i++,j=i+1)
		{
			System.out.println(i+" "+j);
		}
	}
}
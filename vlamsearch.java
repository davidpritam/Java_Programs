class VLAM
{
	public static void main(String []s)
	{
		Search(3,8,2,5,3,1,7,3);
	}
	static void Search(int x,int...a)
	{
		int count=0;
		for(int i:a)
		{	
			if(i==x)
				count++;
		}
			if(count==0)
				System.out.println(x+" is not found");
				else
				System.out.println(x+" is found "+count+" times");
	}
}
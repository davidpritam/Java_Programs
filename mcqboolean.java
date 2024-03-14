class Q
{
	static boolean xyz(char c)
	{
		System.out.print(c);
		return false;
	}
	public static void main(String []args)
	{
		int i=0;
		for(xyz('A');xyz('B')&&(i<2);xyz('C'))
		{
			i++;
			xyz('D');
		}
	}
}
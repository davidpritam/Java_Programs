class GetBytes
{
	public static void main(String []args)
	{
		String s="Farida";
		byte b[]=s.getBytes();
		for(int i=0;i<b.length;i++)
		System.out.print(b[i]+" ");
	}
}
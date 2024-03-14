class ByteToString
{
	public static void main(String []s)
	{
		byte b[]=new byte[]{65,66,67,68,69,70,71,72,73,74};
		String str=new String(b);
		//String str1=new String(b,2,12 );//StringIndexOutOfBoundsException
		System.out.println(str+" ");
		//System.out.println(str1);
	}
}
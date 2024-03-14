class CharToString
{
	public static void main(String []args)
	{
		char ch[]=new char[]{'a','b','c','d','e','f','g'};
		String s=new String(ch,1,5);
		System.out.println(s);//bcdef
		String s1=new String(ch,1,10);
		System.out.println(s1);
	}
}
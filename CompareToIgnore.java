class CompareToIgnore
{
	public static void main(String []s)
	{
		String s1=new String("Indian");
		String s2=new String("indfan");
		System.out.println(s1.compareToIgnoreCase(s2));//return 0 because all are same
		System.out.println(s1.compareTo(s2));//return -32
		int y=s1.compareToIgnoreCase(s2);
		System.out.println(y);
	}

}
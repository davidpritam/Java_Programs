class ContainsDemo
{
	public static void main(String []args)
	{
		String s1=new String("Lieutenant");
		boolean b=s1.contains("ten");
		System.out.println(b);//return true because given string is prsent
		boolean c=s1.contains("Ten");
		System.out.println(c);//return false
	}
}
		
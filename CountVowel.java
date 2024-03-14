class CountVowel
{
	public static void main(String []args)
	{
		String s="Sourav";
		s=s.toupperCase();
		int count=0;
		
		char ch[]=new char[s.length()];
		s.getChars(0,s.length,ch,0);
		for(int j=0;j<ch.length;j++)
		{
			if(ch[j]=='A' ch[j]== || ch[j]=='E' || ch[j]== 'I' || ch[j]== 'O' || ch[j]== 'U')
				count++;
		}
			System.out.println(count);		
	}
} 	
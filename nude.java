class NudeNo

{
	public static void main(String []s)
	{
		int n=672,a,d,b;
		boolean p=false;
		b=n;
		
		while(n>0)
		{
			d=n%10;
			if(b%d==0)
				p=true;
			else
			{	
				p=false;
				break;
			}
			n=n/10;	
		}
				if(p==true)
					System.out.println(b+"is a nude no");
				else
					System.out.println(b+"is not a nude no");
	}
}
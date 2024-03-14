class MysteryNo
{
	public static void main(String []args)
	{
		int n=121,i;
		for(i=1;i<=n/2;i++)
		{
			j=n-i;
			k=reverse(i);
			if(j==k)
				System.out.println(n+"is a Mystery N0");
			else
				System.out.println(n+"is Not a Mystery N0");		
		}
	}
			static int reverse(int x)
			{
				int r=0,d,t;
				t=x;
				while(x>0)
				{
					d=x%10;
					r=r*10+d;
					x=x/10;
				}
					if(t==r)
						return r;
			}

}
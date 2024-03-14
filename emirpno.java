import java.util.Scanner;
class EmirpNo
{
	public static void main(String []args)
	{
		int i,r=0,count=0,k=0,t,d,n;
		System.out.println("Enter a no");
		Scanner p=new Scanner(System.in);
		n=p.nextInt();
		t=n;
			for(i=1;i<=n;i++)
			{
				if(n%i==0)
				count++;
			}
				if(count==2)
				{
					while(n>0)
					{
						d=n%10;
						r=r*10+d;
						n=n/10;
					}
						System.out.println("reverse is"+r);
							for(i=1;i<=r;i++)
							{
								if(r%i==0)
									k++;
							
							}
									if(k==2)
										System.out.println(r+"Emirp No");
									else
										System.out.println("Not Emirp No");
				}
				else 
					System.out.println("Not Emirp No");
	}
}
										
		
	
				
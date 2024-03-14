import java.util.Scanner;
class HighestFactor
{
	public static void main(String []s)
	{
		int a,b,i,min,hcf=0;
		Scanner p=new Scanner(System.in);
		System.out.println("Enter the two no");
		a=p.nextInt();
		b=p.nextInt();
			if(a>b)
				min=b;
			else
				min=a;
					for(i=min;i>=1;i--)
					{
						if(a%i==0 && b%i==0)
						{
							hcf=i;
							break;
						}
					}
							System.out.println(hcf);
	}
}
						
						
						
					
		
		
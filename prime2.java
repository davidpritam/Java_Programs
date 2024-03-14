import java.util.Scanner;
class prime2
{
	public static void main(String []s)
	{
		int n,i;
		boolean p=false;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the valule of number"); 
		n=sc.nextInt();
			for(i=2;i<n/2;i++)
			{
				if(n%i==0)
				{
					p=true;
					break;
				}
			}
					if(p==false)
					
						System.out.println("Prime no");
					else 
						System.out.println("Not a prime no");
					
	}
}
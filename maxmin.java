import java.util.Scanner;
class FindMaxMin
{
	public static void main(String []s)
	{
		int i,n;
		System.out.println("Enter the number");
		Scanner p=new Scanner(System.in);
		
		n= p.nextInt();
		int a[]=new int[n];
		int max,min;
		System.out.println("Enter the "+n+" values");
			for(i=0;i<a.length;i++)
				a[i]=p.nextInt();
				max=min=a[0];
				for(i=1;i<a.length;i++)
				{
			        	if(a[i]>max)
						max=a[i];
					if(a[i]<min)
						min=a[i];
				}
				
				System.out.println("minumum no is  "+  min);
				
			
					System.out.println("Maximum no is"+max);
	}
}
		
				
					
					
				
		
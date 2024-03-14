import java.util.Scanner;
class CheckLessThan10
{
	public static void main(String []args)
	{
		int i,n,no=10;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the  " + n + "values ");
			for(i=0;i<a.length;i++)
			a[i]=sc.nextInt();

			for(i=0;i<a.length;i++)
			{
				int d=2;
				while(a[i]<no)
				{
					
					a[i]=a[i]*d;
						d++;
				}
			}
				for(i=0;i<a.length;i++)
					System.out.print(a[i]+" ");
	}
}
				
				
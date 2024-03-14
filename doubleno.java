import java.util.Scanner;
class DoubleOfNo
{
	public static void main(String []s)
	{
		int i,j,n,no=10;
		System.out.println("Enter the size of array");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int a[]=new int [n];
		System.out.println("Enter the values of N");
		for(i=0;i<a.length;i++)
			a[i]=sc.nextInt();
			
		for(i=0;i<a.length;i++)
		{
			for(j=2;j<=10;j++)
			{
				if(a[i]<no)
					a[i]=a[i]*j;
					
				System.out.println(a[i]);
					break;
			}
		}
	}
}
			
			
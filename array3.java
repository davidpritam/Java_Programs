import java.util.Scanner;
class Array3
{
	public static void main(String []args)
	{
		int n,i,sum=0;
		double avg=0;
		System.out.println("Enter the size of array");
		Scanner p=new Scanner(System.in);
		n=p.nextInt();
		int a[]=new int[n];
		System.out.println("ENTER the value of n");
		for(i=0;i<a.length;i++)
		{
			a[i]=p.nextInt();
			sum=sum+a[i];
			avg=(double)sum/n;
		}
		for(i=0;i<a.length;i++)
		System.out.print(a[i]+" ");

		System.out.println("sum is"+" "+sum);
				System.out.println("average is "+" "+avg);
	}
}
	
import java.util.Scanner;
class FindEvenOdd
{
	public static void main(String []s)
	{
		int i,n,count=0,odd=0;
		System.out.println("Enter the size of array");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int a[]=new int [n];
		System.out.println("Enter the values of N");
		for(i=0;i<a.length;i++)
			a[i]=sc.nextInt();

		for(i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
				count++;
			else
				odd++;
		}
			System.out.println("Even no is"+count);
			System.out.println("Odd no is"+ odd);
	}
}
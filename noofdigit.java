import java.util.Scanner;
class NoOfDigits
{
	public static void main(String []s)
	{
		int n,count=0,sum=0,d;
		Scanner p=new Scanner(System.in);
		System.out.println("Enter the number");
		n=p.nextInt();
			while(n>0)
			{
				d=n%10;
				count++;
				sum=sum+d;
				n=n/10;
			}
				System.out.println("No of digits is " + count);
				System.out.println("Sum of digits is "+ sum);
	}
}
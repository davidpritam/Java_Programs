import java.util.Scanner;
class ReverseNumber
{
	public static void main(String []args)
	{
		int i,j,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no");
		n= sc.nextInt();
			for(i=n;i>=1;i--)
			{
				for(j=i;j>=1;j--)
					System.out.print(j-1);

					System.out.println();
			}
	}
}
							
					
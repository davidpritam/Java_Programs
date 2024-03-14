import java.util.Scanner;
class RevNo
{
	public static void main(String []s)
	{
		int i,j,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a No");
		n=sc.nextInt();
			for(i=1;i>=n;i++)
			{
				for(j=n;j>=i;j--)
					System.out.print(j);
				
					System.out.println();
			}
	}
}
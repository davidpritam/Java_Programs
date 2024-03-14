import java.util.Scanner;
class array
{
	public static void main(String[] s)
	 {
		int n;
		System.out.println("enter the number");
		Scanner p=new Scanner(System.in);
		n=p.nextInt();
		int a[]=new int[n];
		for(int i=0;i<=a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
	}
}
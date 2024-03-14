import java.util.Scanner;
class coordinate
{
	public static void main(String []s)
	{
		int a,b;
		Scanner p=new Scanner(System.in);
		System.out.println("Enter the two no");
		a=p.nextInt();
		b=p.nextInt();
		if(a>0 && b>0)
			System.out.println("1st quadrant");
		else if(a<0 && b>0)
			System.out.println("2nd quadrant");
		else if(a>0 && b<0)
			System.out.println("4th quadrant");
		else
			System.out.println("3rd quadrant");
		
	}
}
		
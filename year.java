import java.util.Scanner;
class CheckYear
{
	public static void main(String []s)
	{
		Scanner p=new Scanner(System.in);
		int y;
		System.out.println("Enter the no of year");
		y=p.nextInt();
		if(y%100==0)
		{
			if(y%400==0)
				System.out.println("Leap year");
			else
				System.out.println("Ordinary Year");
		}
		else
		{
			if(y%4==0)
				System.out.println("Leap Year");
			else 
				System.out.println("Ordinary Year");
		}
	}
}
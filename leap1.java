import java.util.Scanner;
class LeapYear
{
	public static void main(String []s)
	{
		Scanner p=new Scanner(System.in);
		int year;
		System.out.println("Enter the year");
		year=p.nextInt();
		String y=(year % 100==0)?( (year % 400==0) ?"Leap Year":("not Leap Year")):((year % 4==0) ?"Leap year":("not leap Year"));
		System.out.println(y);
	}
}
		
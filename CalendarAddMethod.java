import java.util.Date;
import java.util.Calendar;
class CalendarAddMethod
{
	public static void main(String []args)
	{
		Calendar c=Calendar.getInstance();
		System.out.println(c.getTime());
		c.add(Calendar.DATE, -15);
		System.out.println("15 days ago "+ c.getTime());
		c.add(Calendar.MONTH, 5);
		System.out.println("After 5 months "+c.getTime());
		c.add(Calendar.YEAR, -5);
		System.out.println("5 Year ago "+c.getTime());
	}
}
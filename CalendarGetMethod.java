import java.util.Date;
import java.util.Calendar;
class CalendarGetMethod
{
	public static void main(String []args)
	{
		Calendar c=Calendar.getInstance();
		System.out.println("The current date is "+c.getTime());
		System.out.println("The current year is "+c.get(Calendar.YEAR));
		System.out.println("The current Month is "+c.get(Calendar.MONTH));
		System.out.println("The current Week is "+c.get(Calendar.DATE));
		System.out.println("The current Week is "+c.get(Calendar.DAY_OF_WEEK));
	}
}
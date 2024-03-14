import java.util.Date;
import java.util.Calendar;
import java.text.Format;
import java.text.SimpleDateFormat;
class SimpleDateFormatDemo
{
	public static void main(String []args)
	{
		Date d1=new Date();
		System.out.println(d1);
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		String sDate=sdf.format(d1);
		System.out.println(sDate);
		SimpleDateFormat sdf1=new SimpleDateFormat("dd-MM-yyyy");
		String sDate1=sdf1.format(d1);
		System.out.println(sDate1);
		SimpleDateFormat sdf2=new SimpleDateFormat("EEE,MMM,d,yyyy,a");
		String sDate2=sdf2.format(d1);
		System.out.println(sDate2);
		SimpleDateFormat sdf3=new SimpleDateFormat("EEEE,MMMM,d,yyyy,a");
		String sDate3=sdf3.format(d1);
		System.out.println(sDate3);
	}
}
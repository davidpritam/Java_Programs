import java.util.Date;
import java.text.SimpleDateFormat;
class SimpleDateFormat1
{
	public static void main(String []args) throws Exception
	{
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		Date d1=sdf.parse("23/12/2001");
		System.out.println("The date is "+d1);
		SimpleDateFormat sdf1=new SimpleDateFormat("MM/dd/yyyy");
		Date d2=sdf1.parse("12/12/2001");
		System.out.println("The date is "+d2);
	}
}
		
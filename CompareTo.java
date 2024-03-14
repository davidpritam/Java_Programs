import java.util.Date;
class CompareTo
{
	public static void main(String []args)
	{
		Date d1=new Date();
		System.out.println(d1);
		Date d2=new Date(2887469875475L);
		System.out.println(d2);
		int x=d1.compareTo(d2);
		System.out.println(x);
		if(x>0)
			System.out.println(d1 +" comes after "+d2);
		else if(x<0)
			System.out.println(d1 +" comes before "+d2);
		else
			System.out.println("Both dates are same");
			
	}
}
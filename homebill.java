import java.util.Scanner;
class HomeBill
{
	public static void main(String []s)
	{
		double unit,bill;
		Scanner p=new Scanner(System.in);
		System.out.println("Enter the no of unit");
		unit=p.nextDouble();
		if(unit<=199)
			bill=unit*1.20;
		else if(unit>=200 && unit<400)
			bill=unit*1.50;
		else if(unit>=400 && unit<600)
			bill=unit*1.80;
		else 
			bill=unit*2.00;
			if(bill<100)
				bill=100;
			else if(bill>400)
				bill=bill+bill*.15;
					System.out.println("Total bill is " + bill);
	}
}
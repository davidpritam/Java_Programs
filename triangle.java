import java.util.Scanner;
class CheckTriangle
{
	public static void main(String []args)
	{
		int a,b,c;
		Scanner p=new Scanner(System.in);
		System.out.println("Enter the first side");
		a=p.nextInt();
		System.out.println("Enter the second side");
		b=p.nextInt();
		System.out.println("Enter the Third side");
		c=p.nextInt();
		if(a+b>c && a+c>b && b+c>a)
		{
			if(a==b && b==c)
				System.out.println("The triangle is Equilateral Triangle");
			else if(a==b || b==c || c==a)					
				System.out.println("The tringle is Isoscelene ");
			else 	
				System.out.println("The triangle is scelene");
		}
		else 
			System.out.println("Triangle could not be drawn");
	}
}
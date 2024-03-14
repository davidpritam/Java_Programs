import java.util.Scanner;
class circle
{
	public static void main(String []s)
	{
	System.out.println("Enter the value of radius");
	double r,a,peri;
	Scanner n=new Scanner(System.in);
	r=n.nextDouble();
	a=Math.PI*Math.pow(r,2);
	peri=2*Math.PI*r;
	System.out.println("Area of circle  is " + a);
	System.out.println("Perimeter of circle is " + peri );
	}
}
		
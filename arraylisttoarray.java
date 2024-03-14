import java.util.ArrayList;
class ArrayListToArray
{
	public static void main(String []s)
	{
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(15);
		a.add(2);
		a.add(22);
		a.add(44);
		a.add(45);
		//Integer arr[]=new Integer[a.size()];
		//arr=a.toArray(arr);
		int sum=0;
		//for(int i:arr)
		//	sum=sum+i;

			//System.out.println("sum is "+sum);
			for(int i=0;i<a.size;i++)
				sum=sum+a.get(i);

			System.out.println(sum);
	}
}
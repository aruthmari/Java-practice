class Calci
{
	public int add(int...n)// variable argues (4,8,54,4,5,1,251) like that
	{
		int sum = 0;
		for (int i : n)
		{
			sum = sum + i;
		}
		return sum;
	}
}
public class varargsdemo 
{
	public static void main(String []args)
	{
		Calci obj = new Calci();
	
		System.out.println(obj.add(5,48,5,4,45,654,12,51));
	}
}

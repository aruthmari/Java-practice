class Calculator	// super class or parent
{
	public int add(int i, int j) // inheritance have more classes
	{
		return (i+j);
	}
}
class Calcsu extends Calculator		// sub class or child
{
	public int sub(int i, int j)
	{
		return (i-j);
	}
}
class Calcmu extends Calcsu		// sub for calcsu
{
	public int multi(int i, int j)
	{
		return (i*j);
	}
}

public class inheritance 
{
	public static void main(String [] args)
	{
		Calcmu obj = new Calcmu();
		
		int result1 = obj.add(5, 3);
		int result2 = obj.sub(4, 7);
		int result3 = obj.multi(8, 5);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}
		
}

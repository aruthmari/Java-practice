class Cons
{
	float num1;
	int num2;
			
	public Cons()
	{
		num1 = 3;
		num2 = 4;
	}
	public Cons(int n)
	{
		num1 = 5;
		num2 = 6;
	}
	public Cons(double i,int e)
	{
		num1 = (float)i;
		num2 = e;
	}
}
public class constructor 
{
	public static void main(String [] args)
	{
		Cons obj = new Cons(5.8,8);
		
		System.out.println(obj.num1);
	}
}

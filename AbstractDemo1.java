class Printer
{
	public void show (Number i)	// here we use Number instead of Integer,Float,Double
	{
		System.out.println(i);
	}
}
public class AbstractDemo1 
{
	public static void main(String args[])
	{
		Printer obj = new Printer();
		obj.show(5.7354544);
	}
}

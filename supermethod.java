class Demo
{
	public Demo()
	{
		System.out.println("apple");
	}
	public Demo(int i)
	{
		System.out.println("ball");
	}
}
class Damo extends Demo
{
	public Damo()
	{
		super(4);
		System.out.println("cat");
	}
	public Damo(int i)
	{
		super(i);					// call super class with parameterized
		System.out.println("dog");
	}
}
public class supermethod 
{
	public static void main(String [] args)
	{
		Damo obj = new Damo();
		
	}
}

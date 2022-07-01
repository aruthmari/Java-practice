abstract class Human		// abstract of content
{
	public abstract void eat();	// here we don't define the function
	public void walk()
	{
	}
}
class Men extends Human
{
	public void eat()	// so we define eat in sub class
	{
	}
}
public class abstractdemo
{
	public static void main(String args[])
	{
		Human obj = new Men();
	}
}
/*In java 1.8 later we can define method in interface
by using keyword default*/

@FunctionalInterface
interface Box
{
	void show();
	default void color()	//using default key to define method in interface
	{
		System.out.println("Green");
	}
}
class Pit implements Box
{
	public void show()
	{
		System.out.println("Red");
	}
	public void color()		// also default method overrode here
	{
		System.out.println("Blue");
	}
}
public class Defaultmethod 
{
	public static void main(String args[])
	{
		Box obj = new Pit();
		obj.show();
		obj.color();		
	}
}

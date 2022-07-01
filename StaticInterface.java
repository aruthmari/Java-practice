interface New
{
	int num = 7;	// in interface the values are constant can't change further
	void abc();
	static void show()		// in interface can use static,default,abstract
	{
		System.out.println("hi");
	}
}
public class StaticInterface 
{
	public static void main(String args[])
	{
		New.show();
	}
}

class A
{
	public void show()
	{
		System.out.println("line A");
	}
}
class B extends A
{
	public void show()
	{
		System.out.println("line B");
	}
}
class C extends A
{
	public void show()
	{
		System.out.println("line C");
	}
}
public class dynamic	// dynamic method dispatch 
{
	public static void main(String args[])
	{
		A obj = new B();	// runtime polymorphism
		obj.show();
		
		obj = new C();		// dynamic method dispatch
		obj.show();
	}
}

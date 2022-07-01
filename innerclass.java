class Door
{
	int a;
	public void show()
	{
		System.out.println("In Display");
	}
	static class Room
	{
		public void display()
		{
			System.out.println("out display");
		}
	}
}
public class innerclass 
{
	public static void main (String args [])
	{
		Door obj = new Door ();
		obj.show();
		
		Door.Room obj1 = new Door.Room (); // if class is non static then (obj.new Inner) only
		obj1.display();
	}
}

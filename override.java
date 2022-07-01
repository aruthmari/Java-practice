class Clas
{
	public void show()
	{
		System.out.println("apple");
	}
}
class Clus extends Clas
{
	@Override
	public void show()
	{
		super.show(); 					// add this one to eliminate override
		System.out.println("boy");
	}
}
public class override 		// method override( clus overrides clas )
{
	public static void main(String args[])
	{int a = 10;
		Clas obj = new Clus();
		obj.show();
	}
	
	
}

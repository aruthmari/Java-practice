class Eight	
{
	public final void show()	// here we use final so can't method override
	{
		System.out.println("GOAL");
	}
}
class Seven extends Eight
{
/*	public void show()
	{
		System.out.println("OUT");	
	}
*/}
public class finalmethod 
{
	public static void main(String args[])
	{
		Eight obj = new Eight();
		obj.show();
	}
}

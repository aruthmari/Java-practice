final class Ten	// here we use final class so class can't extend
{
	public void show()
	{
		System.out.println("GOAL");
	}
}
/*class Nine extends Ten
{
	public void show()
	{
		System.out.println("OUT");	
	}
}*/
public class finalclass 
{
	public static void main(String args[])
	{
		Ten obj = new Ten();
		obj.show();
	}
}

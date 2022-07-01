public class Enumerators 
{
	enum level
	{
		LOW,MEDIUM,MODERATE,HIGH,EXTREME
	}
	public static void main(String [] args)
	{
		for (level myvar : level.values())
		{
		System.out.println(myvar);
		}
	}
}

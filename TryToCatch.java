
public class TryToCatch 
{
	public static void main(String args[])
	{
		try
		{
			int s[] = {1,2,3,4};
			System.out.println(s[4]);
		}
		catch (Exception e)
		{
			System.out.println("Something went wrong.");
		}
		finally
		{
			System.out.println("The 'try catch' is finished");
		}
	}
}

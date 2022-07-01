public class CheckAge 
{
	static void checkAge(int age) throws ArithmeticException
	{
		if(age<18)
		{
			throw new ArithmeticException("Access Denied - You are under age");
		}else { System.out.println("Access Granted"); 
		}
	}
	public static void main(String args[])
	{
		checkAge(15);
	}
}

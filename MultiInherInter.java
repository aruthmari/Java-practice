interface Cpu
{
	default void key()
	{
		System.out.println("Program");
	}
}
interface Board		// multiple inheritance with interface
{
	default void show()
	{
		System.out.println("Circuit");
	}
}
class Cable implements Cpu,Board
{
	public void key()
	{
		System.out.println("Like");
	}
	public void show()
	{
		Board.super.show();		//to override ambiguity issue
	}
}
public class MultiInherInter 
{
	public static void main(String args[])
	{
		Cable obj = new Cable();
		obj.show();
		obj.key();
	}
}

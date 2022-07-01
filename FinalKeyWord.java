/*final keyword is used for variable,method and classes*/
/*here for variables*/
class F
{
	final int DAY=0; // final keyword make things constant
	public void show()
	{
	//	DAY=10;	// show error because the final keyword used
		System.out.println(DAY);
	}
}
public class FinalKeyWord 
{
	public static void main(String args[])
	{
		F obj = new F();
		obj.show();
	}
}

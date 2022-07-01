/*Types of Interfaces
1.Normal Interface - using more than one method
2.Single Abstract method - using single method only / functional interface used lambda expressions
3.Marker Interface - no methods used*/

interface Fun
{
	void show();
}
public class functionalInt 
{
	public static void main(String args[])
	{
		Fun obj = () -> System.out.println("Lambda Expression from Scala");
		obj.show();
	}

}


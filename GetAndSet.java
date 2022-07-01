class Person
{
	private String name;
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	
}
public class GetAndSet
{
	public static void main(String [] args)
	{
		Person men = new Person();
		men.setName("John");
		System.out.println(men.getName());
		men.setName("Mari");
		System.out.println(men.getName());
	}
}


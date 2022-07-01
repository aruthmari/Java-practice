class Gang
{
	public void show()
	{
		System.out.println("War");
	}
}
public class AnonymousClass
{
	public static void main(String args[])
	{
		Gang obj = new Gang()					// here we don't use subclass name
					{
						public void show()
						{
							System.out.println("Silence");
						}
					};
		obj.show();
	}
}

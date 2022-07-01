
public class jump {

	public static void main(String []args)
	{
		for (int i=1;i<=10;i++)
		{
			if(i==6)
			{
				continue;
			}
			if(i==8)
			{
				break;
			}
			System.out.println("Value is " + i);
		}
	}
}

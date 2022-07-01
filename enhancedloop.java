
public class enhancedloop
{
	public static void main(String args [])
	{
		int a[] = {2,3,4,5};
		int b[][] = {
						{4,5,8,1},
						{5,4,3},			//jagged array
						{8,1,3,8,9}
					};
		
		for(int k[] : b)
		{
			for(int l : k)
			{
				System.out.print(" " + l);		
			}
				System.out.println();
	}
	}
}

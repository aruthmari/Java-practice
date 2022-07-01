
public class array 
{
	public static void main(String args [])
	{
		int a[] = {2,3,4,5};
		int b[][] = {
						{4,5,8,1},
						{5,4,3},			//jagged array
						{8,1,3,8,9}
					};
		
	for (int i=0;i<b.length;i++)
	{
		for (int j=0;j<b[i].length;j++)
		{
			System.out.print(" " + b[i][j]);		
		}
		System.out.println();
	}
	}
}

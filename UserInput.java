import java.util.Scanner;

public class UserInput 
{
	public static void main(String [] args)
	{
		Scanner number1 = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int x = number1.nextInt();
		
		System.out.println("Enter another number");
		int y = number1.nextInt();
		
		int sum = x+y;
		System.out.println("Sum of x&y is : "+sum);
	}
}

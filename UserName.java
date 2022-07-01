import java.util.Scanner;

public class UserName 
{
	public static void main(String args[])
	{
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter Username, Age & Salary");
		
		String userName = myObj.nextLine();
		int age = myObj.nextInt();
		double salary = myObj.nextDouble();
		System.out.println("UserName is : "+userName);
		System.out.println("Age is : "+age);
		System.out.println("Salary is : "+salary);
	}
}

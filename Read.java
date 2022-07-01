import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read 
{
	public static void main(String [] args)
	{
		try
		{
			File myFile = new File("D:\\Project\\Testing.txt");
			Scanner myRead = new Scanner(myFile);
			while(myRead.hasNextLine())
			{
				String data = myRead.nextLine();
				System.out.println(data);
			}myRead.close();
		}catch (FileNotFoundException e)
		{
			System.out.println("An error occurred");
			e.printStackTrace();
		}
	}
}

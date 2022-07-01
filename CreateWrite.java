import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateWrite 
{
	public static void main(String [] args)
	{
		try
		{
			File myFile = new File("D:\\Project\\Testing.txt");
			if (myFile.createNewFile())
				{
					System.out.println("Successfully File created : "+ myFile.getName());
				}else System.out.println("File already exists");
		}catch (IOException e)
			{
				System.out.println("An error while Create");
				e.printStackTrace();
			}
		try
		{
			FileWriter myWrite = new FileWriter("D:\\Project\\Testing.txt");
			myWrite.write("Java is very fun to learn \nIt's also so Tricky");
			myWrite.close();
			System.out.println("Successfully wrote to the file");
		}catch (IOException e)
			{
				System.out.println("An error while write");
				e.printStackTrace();
			}
	}
}

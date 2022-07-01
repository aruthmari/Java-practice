import java.io.File;

public class GetFileInfo 
{
	public static void main(String [] args)
	{
		File myFile = new File("D:\\Project\\Testing.txt");
		if(myFile.exists())
		{
			System.out.println("File is readable : "+myFile.canRead());
			System.out.println("File is writable : "+myFile.canWrite());
			System.out.println("File path : "+myFile.getAbsolutePath());
			System.out.println("File name : "+myFile.getName());
			System.out.println("File length : "+myFile.length());
		}else System.out.println("File doesn't exists");
	}
}

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateAndTime 
{
	public static void main(String args[])
	{
		LocalDateTime myObj = LocalDateTime.now();
		System.out.println(myObj);
		
		DateTimeFormatter myObj1 = DateTimeFormatter.ofPattern("dd.MM.YYYY HH.mm.SS");
		String output = myObj.format(myObj1);
		System.out.println(output);
	}
}

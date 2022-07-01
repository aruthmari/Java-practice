import java.util.regex.*;

public class RegEx 
{
	public static void main(String args[])
	{
		Pattern patt = Pattern.compile("marimuthu",Pattern.CASE_INSENSITIVE);
		Matcher match = patt.matcher("Visit Marimuthu");
		boolean matchfound = match.find();
		if(matchfound)
		{
			System.out.println("Match Found");
		}else System.out.println("Match doesn't found");
	}
}

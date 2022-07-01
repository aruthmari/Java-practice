import java.util.*;


public class CharCount 
{
	public void set1(String str)
	{
		char[] charSet = str.toCharArray();
		
		HashMap<Character,Integer> charMap = new HashMap<Character,Integer>();
		
		for (char letter : charSet)
		{
			if(charMap.containsKey(letter))
			{
				charMap.put(letter, charMap.get(letter)+1);
			}else
				charMap.put(letter, 1);
		}
		System.out.println(charMap);
	}
	
	public static void main(String []args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your NAME");
		String str = input.nextLine();
		CharCount.set1(str);
	}
}

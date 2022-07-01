
public class Practice2 
{
	public static void main(String args[])
	{
		String[][] mobiles = {{"Nokia","Samsung","Apple"},
							{"Honor","Tenor","CAT"},
							{"Micromax","Lava","Oppo"}};
		System.out.println(mobiles[2][2]);
		
	// change the element name of an array
		mobiles[2][2] = "Poco";
		System.out.println(mobiles[2][2]);
	
		Integer number = 100;
		String name = number.toString();
		System.out.println(name);
	}
}

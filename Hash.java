import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Hash 
{
	public static void main(String args [])
	{
		HashMap<String,Integer> people = new HashMap<String,Integer>();
		people.put("Suresh",25);
		people.put("Leela",45);
		people.put("Sundar",15);
		people.put("Ramesh",55);
		people.put("John",05);
		
		for(String i : people.keySet())
				{
					System.out.println(i+" is "+ people.get(i)+" years old");
				}
		HashSet<String> cars = new HashSet<String>();
		cars.add("BMW");
	//	cars.add("BMW");
		cars.add("Benz");
		cars.add("Audi");
		cars.add("Bentley");
		cars.add("Shelby");
		
		System.out.println(cars);
		if(cars.contains("Audi"))
		{
			System.out.println("Yes It contains Audi");
		}else System.out.println("NO");
	
		Iterator<String> it = cars.iterator();
		System.out.println(it.next());
		System.out.println(it.next());
	}
}

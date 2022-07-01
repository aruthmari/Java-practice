import java.util.ArrayList; // LinkedList and HashSet classes almost the same method
import java.util.Collections;

public class ArrayAndCollection 
{
	public static void main(String args [])
	{
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Ford");
		cars.add("Mazda");
		cars.add("Bugatti");
		cars.add("Mahindra");
		cars.add("Chevy");
		
		ArrayList<Integer> myNum = new ArrayList<>();
		myNum.add(35);
		myNum.add(54);
		myNum.add(15);
		myNum.add(85);
		myNum.add(25);
		myNum.add(13);
		
		cars.set(2,"Jeep");
		int g = cars.size();
		System.out.println("Size of Array is "+g);
		
		for(String i:cars)
		{
		System.out.println(i);
		}
		Collections.sort(myNum);
		System.out.println(myNum);
		System.out.println(cars);
		System.out.println(cars.get(2));
	}
}

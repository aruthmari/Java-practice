
public class wrapping 
{
	public static void main (String args [])
	{
		int i  = 5;		// primitive datatype
		Integer ii = new Integer(i);	// boxing or wrapping
		
		int j = ii.intValue(); //unboxing or unwrapping
		
		Integer value = i; // autoboxing
		
		int k = value; // autounboxing
	}
}	// so why we use this method is in framework we deal with
// object data in java we deal with primitive data


public class Testing 
{
	public static void main(String [] args)
	{
		float my_ID = 5.99646f;
		long hint = 4_875_321_343_248_645_584l;
		float f1 = 35e3f;
		double d1 = 12E4d;
		double gh = 7;
		int q =(int)gh;
		System.out.println(f1);
		System.out.println(d1);
		System.out.println(hint);
		System.out.println(q&=5);
		
		// operators
		
		int c =-13;
		int d = 15;
		boolean e = true;
		boolean k = false;
		System.out.println(!e);
		System.out.println(!k);
		System.out.println(~c);
		System.out.println(~d);
		System.out.println(25>>2);
		System.out.println("Hello World");
		
		String magic = " Hakkuna Mattata ";
		String movie = "Lion King";
		System.out.println(magic.charAt(8));
		System.out.println(magic.codePointAt(7));
		System.out.println(magic.codePointBefore(9));
		System.out.println(magic.codePointCount(1, 5));
		System.out.println(magic.compareTo(movie));
		System.out.println(magic.isEmpty());
		System.out.println(magic.hashCode());
		System.out.println(magic.trim());
		System.out.println(magic.toString());
		
	}
}

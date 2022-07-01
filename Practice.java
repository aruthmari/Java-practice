public class Practice 
{
	public static void main(String args[])
	{
		String txt = "Hello";							
		System.out.println(1+" lowercase "+txt.toUpperCase());	//1
		System.out.println(2+" uppercase "+txt.toLowerCase());	//2
	
		String firstName = "Mari";
		String lastName = "muthu";
		System.out.println(3+" Concatenate+ "+firstName+lastName);	//3
		System.out.println(4+" Concatenate. "+firstName.concat(lastName));	//4	
		
		String name = firstName + lastName;
		System.out.println(5+" Position of 'm' char is "+name.indexOf("m"));	//5
		System.out.println(6+" Character at 5th position is "+name.charAt(5));		//6
		
		int x = 5, y = 2;
		int z = Math.max(x, y);
		System.out.println(7+" MAX "+z);	//7
		
		Double r =Math.random()*100;	// general method in range of 0 to 1
		System.out.println(8+" Random "+r.hashCode());	//8
	
		String k = (x<y)? "Condtion Right" : "Condtion Wrong";	// conditional operator
		System.out.println(9+" "+k);	//9
		
		int b =(int)Math.sqrt(y);
		System.out.println(10+" square root of 16 is "+b);	//10
		
		boolean isJavaFun = true;
		boolean isFishTasty = false;
		System.out.println(11+" Statement is "+isJavaFun);	//11
		System.out.println(12+" Statement is "+isFishTasty);	//12
		
		if (x<y)System.out.println(13+" "+"If Greater");	//13
		if (x!=y)System.out.println(14+" "+"If Not Equal");	//14
		else System.out.println(15+" "+"If Equal"); //15
		
		switch (x)			// switch statement
		{
		case 4:
			System.out.println(15+" "+"Sunday");
			break;
		case 5:
			System.out.println(15+" "+"Monday");
			break;
		default:
			System.out.println(15+" "+"Weekend");
		}
		
		String[] cars = {"Volvo ","BMW ","Ford"};	// for enhanced loop
		for (String i:cars)
		{
			System.out.print(16+" "+i);
		}
			System.out.println("\n"+17+" "+cars[1]);
			System.out.println(18+" "+cars.length);
		
		float t = 4.77f;
		System.out.println("19"+" "+(int)Math.abs(t));
		
		System.out.println("20"+" "+(int)(Math.random()*100));
		
		int l = 7;
				
		for (int j=1;j<=10;j++){
		System.out.println("21"+"\t"+j+"*"+l +"=" + j*l);
		}
		
		while(l<11)
		{
			System.out.println("22"+"\t"+l);
			l++;
		}
		String[][] brands = {{"Hello","Bye","Samsung"},
							 {"Philips","Nokia","Realme"},
							 {"Redmi","Gionee","Apple"}};
		for (String v[]:brands)
		{
			for (String h : v)
			{
				System.out.print(" "+h);
			}
			System.out.println();
		}
		}
}
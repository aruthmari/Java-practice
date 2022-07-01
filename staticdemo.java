class Emp
{
	int eid;
	int salary;
	static String ceo;
	
	static
	{
		ceo = "Larry";
	}
	
	public void show()
	{
		System.out.println(eid + " : " + salary + " : " + ceo);
	}
}
public class staticdemo 
{
	public static void main(String [] args)
	{
		Emp navin = new Emp();
		navin.eid = 8;
		navin.salary = 4000;
	//	Emp.ceo = "Mahesh";
		
		Emp jagan = new Emp();
		jagan.eid = 9;
		jagan.salary = 5000;
	//	Emp.ceo = "Mahesh";
		
	//	Emp.ceo= "Arun";
	
		navin.show();
		jagan.show();
	}
}

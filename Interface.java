interface Writer	//interface supports multiple inheritance
{
	void write(); //for interface no method define its an abstract
}
class Pen implements Writer		//for interface - implements
{
	public void write()
	{
		System.out.println("I am a Pen");
	}
}
class Pencil implements Writer
{
	public void write()
	{
		System.out.println("I am a Pencil");
	}
}
class Kit
{
	public void doSomething(Writer p)
	{
		p.write();
	}
}
public class Interface 
{
	public static void main(String args[])
	{
		//Kit k = new Kit();		// we can't use interface object, reference only
		Writer p = new Pen();
		Writer pc = new Pencil();
		
		new Kit().doSomething(pc); 
	}
}

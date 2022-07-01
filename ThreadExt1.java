public class ThreadExt1 extends Thread	//extends without concurrency problem
{
	public static int total = 0;
	
	public static void main(String args[])
	{
		ThreadExt1 newThread = new ThreadExt1();
		newThread.start();
		while (newThread.isAlive())
		{
			System.out.println("Waiting");
		}
		System.out.println(total);
		total++;
		System.out.println(total);
	}
	public void run()
	{
		total++;
	}
}
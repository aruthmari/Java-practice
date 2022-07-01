/*we can't extends the thread extended class to another one
but in interface we extend the thread implemented class to another one
*/
public class ThreadInter implements Runnable//interface thread class without concurrency
{
	public static int amount = 0;
	
	public static void main(String args[])
	{
		ThreadInter obj = new ThreadInter();
		Thread thread = new Thread(obj);
		thread.start();
		while(thread.isAlive())		// this method is used to avoid concurrency problem
		{
			System.out.println("Waiting");
		}
		System.out.println(amount);
		amount++;
		System.out.println(amount);
	}
	public void run()
	{
		amount++;
	}
}



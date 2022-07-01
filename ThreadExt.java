public class ThreadExt extends Thread // extends with concurrency problem
{
	public static int amount = 0;
	
	public static void main(String args[])
	{
		ThreadExt thread = new ThreadExt();
		thread.start();
		System.out.println(amount);
		amount++;
		System.out.println(amount);
	}
	public void run()
	{
		amount++;
	}
}

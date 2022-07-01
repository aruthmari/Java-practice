public class EfficientMultiThread // multiple thread with lambda expressions
{
	public static void main(String[] args)throws Exception { // this throws for join err
		Thread t1 = new Thread(() -> {
			for (int i = 0; i <= 5; i++) {
				System.out.println("HI");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
				}
			}
		});
		Thread t2 = new Thread(() -> {
			for (int i = 0; i <= 5; i++) {
				System.out.println("HELLO");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
				}
			}
		});
		t1.start();
		try {
			Thread.sleep(5);
		} catch (Exception e) {
		}
		t2.start();
		
		t1.join();		//if it not present then bye interfere first
		t2.join();
		
		System.out.println("bye");
	}
}

package q21;

 class Test implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread is Running");
		
	}
	
}
public class Main{
	public static void main(String[] args) {
		Test test = new Test();
		test.run();
		
		Thread thread = new Thread();
		thread.start();
		
		new Thread() {
			public void run() {
				System.out.println("Thread2 is Running");
			};
		}.start();
		new Thread() {
			public void run() {
				System.out.println("Thread 3 is Runing");
			};
		}.start();
	}
	
}


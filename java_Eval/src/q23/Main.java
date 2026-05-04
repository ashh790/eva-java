package q23;

class Message{
	String message="";
}

public class Main {
	public static void main(String[] args) {
		
		Main message = new Main();
		new Thread(new Runnable() {
			public void run() {
				synchronized (message) {
					try {
						System.out.println("Waiting for the Message");
						message.wait();
						System.out.println("Got the Message");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}).start();
		
		new Thread(new Runnable() {
			public void run() {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized (message) {
					System.out.println("Sending the Message");
					message.notify();
				}
			}
		}).start();
		
	}
}

package q24;


class Calc {
	synchronized void mul(int a) {
		for (int i = 1; i <= 5; i++)
			System.out.println(i * a);
		try {
			Thread.sleep(400);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

class Thread1 extends Thread {
	Calc c;

	public Thread1(Calc c) {
		this.c = c;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		c.mul(5);
	}
}

class Thread2 extends Thread{
	Calc c;

	public Thread2(Calc c) {
		this.c = c;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		c.mul(10);
	}
}

public class Main {
	public static void main(String[] args) {
		Calc calc = new Calc();
		Thread1 thread1 = new Thread1(calc);
		Thread2 thread2 = new Thread2(calc);
		thread1.start();
		thread2.start();
		
	}
}

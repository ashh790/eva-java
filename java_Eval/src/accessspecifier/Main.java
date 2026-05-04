package accessspecifier;

public class Main{
	public int a =10;
	private int b = 10;
	protected int c =10;
	int d=10;
	
	public static void main(String[] args) {
		Main man = new Main();
		System.out.println(man.a);
		System.out.println(man.b);
		System.out.println(man.c);
		System.out.println(man.d);
	}
}
	



	

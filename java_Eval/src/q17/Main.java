package q17;

public class Main {
	public static double divide(int n1,int n2) { 
		return n1/n2;
	}
	public static void calDiv(int n1,int n2, String operation) {
		if (operation.equals("/")) {
			double result = divide(n1,n2);
			System.out.println(result);
		}
	}
	public static void main(String[] args) {
		try {
			calDiv(10,0,"/");
		}catch (Exception e) {
			System.out.println(e);
		}

	}

}

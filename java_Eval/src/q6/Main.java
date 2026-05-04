package q6;

class InvalidOperationException extends Exception{
	public InvalidOperationException() {
		System.out.println("Invalid operation");
	}
}


public class Main {
	public static void cal(int n1, int n2, String Operation) throws InvalidOperationException {
		if(Operation.equals("+")) {
			System.out.println(n1+n2);
		}else if (Operation.equals("-")) {
			System.out.println(n1-n2);
		}else if (Operation.equals("*")) {
			System.out.println(n1*n2);
		}else if (Operation.equals("/")) {
			try {
			System.out.println(n1/n2);
		}catch (Exception e) {
			System.out.println(e);
		}
	}else {
		throw new InvalidOperationException();
	}
	}
	public static void main(String[] args) {
		try {
			cal(10,20,"Ash");
		}catch(InvalidOperationException e) {
			e.printStackTrace();
		}
	}

}
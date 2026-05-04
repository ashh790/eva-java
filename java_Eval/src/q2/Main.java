package q2;

class CalSalPolicy{
	public CalSalPolicy calSal(double salary) {
		System.out.println(salary);
		return this;
	}
}
class Manager extends CalSalPolicy{
	@Override
	public Manager calSal(double salary) {
		System.out.println(salary);
		return this;

	}
	public Manager calSal(double salary,double bonus) {
		System.out.println("Manager sal"+(salary+bonus));
		return this;
		
	}
	
}
class Emp  extends CalSalPolicy{
	
			public Emp calSal(double salary) {
				System.out.println("Emp sal"+ salary);
				return this;
				
				
			}		
	}

public class Main {
	public static void main(String[] args) {
		Manager manager = new Manager();
		manager.calSal(15000);
		manager.calSal(15000, 1000);
		Emp emp = new Emp();
		emp.calSal(10000); 
	}

}
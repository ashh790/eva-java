package q20;

class Emp{
	int id=101;
	String name = "Ashraf";
	double sal =25000;
	String Address="Malad";
@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", sal=" + sal + ", Address=" + Address + "]";
	}
public void displayInfo() {
	System.out.println(id);;
	System.out.println(name);
	System.out.println(sal);
	System.out.println(Address);
}
}
public class Main {

	public static void main(String[] args) {
		Emp emp = new Emp();
		emp.displayInfo();
	}

}

package q13;
class Address{
	String add1;
	String add2;
	public Address(String add1, String add2) {
		super();
		this.add1 = add1;
		this.add2 = add2;
	}
	@Override
	public String toString() {
		return "Address [add1=" + add1 + ", add2=" + add2 + "]";
	}
}
class Hobbies{
	String h1;
	String h2;
	public Hobbies(String h1, String h2) {
		super();
		this.h1 = h1;
		this.h2 = h2;
	}
	@Override
	public String toString() {
		return "Hobbies [h1=" + h1 + ", h2=" + h2 + "]";
	}
	
}
class Emp{
	int id;
	String name;
	Address address;
	Hobbies hobbies;
	public Emp(int id, String name, Address address, Hobbies hobbies) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.hobbies = hobbies;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", address=" + address + ", hobbies=" + hobbies + "]";
	}



}
public class Main {
public static void main(String[] args) {
	Address address=new Address("MiraRd", "Borivali");
	Hobbies hobbies=new Hobbies("Driving", "Learning");
	Emp emp=new Emp(101,"Laksh",address,hobbies);
	System.out.println(emp);
	System.out.println(emp.address.add1);
}
}
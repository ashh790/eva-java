package q26;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Emp implements Serializable {
	String name;
	int id;
	String dept;

	public Emp(String name, int id, String dept) {
		super();
		this.name = name;
		this.id = id;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + ", dept=" + dept + "]";
	}
}

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Emp emp = new Emp("Baigan", 120, "IT");


try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("emp.txt"))) {
			out.writeObject(emp);
			System.out.println("Data added...");
		} catch (Exception e) {
			System.out.println(e);
		}
		
//deserialazible
		try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("emp.txt"))){
			Emp emp2 =(Emp)in.readObject();
			System.out.println(emp2);
		}catch (Exception e) {
			System.out.println(e);
		}
	}
	}

	
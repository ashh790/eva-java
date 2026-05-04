package q18;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		List list = new ArrayList();
		
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		
		ListIterator iterator =list.listIterator();
		while(iterator.hasNext()) {
			Object object =iterator.next();
			System.out.println(object);
		}
		while(iterator.hasPrevious()) {
			Object object = iterator.previous();
			System.out.println(object);
		}
		
		Vector vector = new Vector();
		vector.add("A");
		vector.add("B");
		vector.add("C");
		vector.add("D");
		
		Enumeration enumeration = vector.elements();
		while(enumeration.hasMoreElements()) {
		Object object = enumeration.nextElement();
		System.out.println(object);
		}
			
		}
	}
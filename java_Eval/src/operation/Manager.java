package q4;

import tl.Tl;

public class Dev1 extends Tl {
	@Override
	public void insertdata() {
		
		System.out.println("insert data ");
	}

}

master page
package master;

import devs.Dev1;
import devs.Dev2;
import devs.Dev3;
import devs.Dev4;

public class Manager {
	public static void main(String[] args) {
		Dev1 dev1 =new Dev1();
		dev1.insertdata();
		Dev2 dev2=new Dev2();
		dev2.updatedata();
		Dev3 dev3 = new Dev3();
		dev3.deletedata();
		Dev4 dev4 = new Dev4();
		dev4.showdata();
			
	}
}

package operation;

public interface Srs{
	void insertdata();
	void updatedata();
	void deletedata();
	void showdata();
}   
package operationimplementor;

import operation.Srs;

public abstract class Manager implements Srs{

	public void updatedata() {
		// TODO Auto-generated method stub
		
	}

}
package operation;

import operationimplementor.Manager;

public class Tl extends Manager {

	@Override
	public void insertdata() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updatedata() {
		// TODO Auto-generated method stub
		
	} 

	@Override
	public void deletedata() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showdata() {
		// TODO Auto-generated method stub
		
	}


}


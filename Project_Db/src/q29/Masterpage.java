package q29;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JToolBar;


public class Masterpage extends JFrame {
	JMenuBar bar;
	JMenu men1,men2,men3,men4,men5,men6;
	JMenuItem item1,item2,item3,item4,item5,item6,item7,item8,item9,item10,item11,item12;
	JToolBar tbar;
	
	public Masterpage() {
		setLayout(new FlowLayout());
		tbar=new JToolBar();
		bar = new JMenuBar();
		men1=new JMenu("Home");
		men2=new JMenu("Doctor");
		men3=new JMenu("Patient");
		men4=new JMenu("Accounts");
		men5=new JMenu("Billing");
		men6=new JMenu("NGO_Acc");
		item1=new JMenuItem("About us");
		item2=new JMenuItem("Services");
		item3=new JMenuItem("Location");
		item4=new JMenuItem("Exit");
		item5=new JMenuItem("Doctor_Info");
		item5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Doctor_Info();
			}
		});
		item6=new JMenuItem("Doctor_Registration");
		item7=new JMenuItem("Payment");
		item8=new JMenuItem("Patient_Info");
		item8.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Patient_Info();
				
			}
		});
		item9=new JMenuItem("Billing");
		item10=new JMenuItem("Registration");
		item11=new JMenuItem("with GST");
		item12=new JMenuItem("Payment_Details");
		
		add(bar);
		add(tbar);
		tbar.add(bar);
		bar.add(men1);
		bar.add(men2);
		bar.add(men3);
		bar.add(men4);
		men4.add(men5);
		men4.add(men6);
		
		men1.add(item1);
		men1.add(item2);
		men1.add(item3);
		men1.add(item4);
		men2.add(item5);
		men2.add(item6);
		men2.add(item7);
		men3.add(item8);
		men3.add(item9);
		men3.add(item10);
		men5.add(item11);
		men6.add(item12);
		
		setSize(400,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Masterpage();
		
	}

}

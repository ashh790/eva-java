package q29;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Doctor_Info extends JFrame {
	JLabel l1,l2,l3;
	JTextField t1,t2,t3;
	JButton btn1,btn2;
	
	public Doctor_Info() {
		// TODO Auto-generated constructor stub
		setLayout(new FlowLayout());
		 l1=new JLabel("id");
		 t1=new JTextField(20);
		 l2=new JLabel("Name");
		 t2=new JTextField(20);
		 l3=new JLabel("contact");
		 t3=new JTextField(20);
		 btn1=new JButton("Submit");
		 btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int id=Integer.parseInt(t1.getText());
				String name=t2.getText();
				Float contact=Float.parseFloat(t3.getText());
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ashdb?useSSL=false", "root", "root123");
					Statement statement=con.createStatement();
					String query="insert into gogo1 values(	"+id+",'"+name+"','"+contact+"')";	
					statement.executeUpdate(query);
					
					System.out.println("data submitted");
			


				} catch (SQLException | ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		 btn2=new JButton("Reset");
		 btn2.addActionListener(new  ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				t1.setText("");
				t2.setText("");
				t3.setText("");
			}
		});
		 
		 add(l1);
		 add(t1);
		 add(l2);
		 add(t2);
		 add(l3);
		 add(t3);
		 add(btn1);
		 setSize(400,400);
		 setVisible(true);
	}
	public static void main(String[] args) {
		new Doctor_Info();
	}
}
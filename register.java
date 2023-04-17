package images;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.sql.SQLException;

import javax.swing.*;
public class register extends JFrame{
    register(){
    	JButton btn = new JButton("register");
    	JButton btn1 = new JButton("Back");
		JLabel book = new JLabel("Register now");
		book.setFont(new Font("Tahoma", Font.CENTER_BASELINE, 35));
		book.setBounds(300, 25, 250, 80);
		add(book);
		JTextField user = new JTextField();
		user.setBounds(330,130, 200, 20);
		JLabel username = new JLabel("Username:");
		username.setFont(new Font("Tahoma", Font.BOLD, 18));
		username.setBounds(200, 100, 150, 80);
		
		add(username);
		add(user);
		
		JTextField first = new JTextField();
		first.setBounds(330,180, 200, 20);
		
		JLabel First = new JLabel("First_name:");
		First.setFont(new Font("Tahoma", Font.BOLD, 18));
		First.setBounds(200, 150, 150, 80);
		
		add(first);
		add(First);
		
		JTextField second = new JTextField();
		second.setBounds(330,230, 200, 20);
		JLabel sec = new JLabel("last_name:");
		sec.setFont(new Font("Tahoma", Font.BOLD, 18));
		sec.setBounds(200, 200, 150, 80);
		
		add(second);
		add(sec);
		
		JTextField third = new JTextField();
		third.setBounds(330,280, 200, 20);
		JLabel email = new JLabel("email:");
		email.setFont(new Font("Tahoma", Font.BOLD, 18));
		email.setBounds(200, 250, 150, 80);
		
		add(third);
		add(email);
		
		JTextField forth = new JTextField();
		forth.setBounds(330,330, 200, 20);
		JLabel phn = new JLabel("phone no:");
		phn.setFont(new Font("Tahoma", Font.BOLD, 18));
	    phn.setBounds(200, 300, 150, 80);
		
		add(forth);
		add(phn);
		
		JTextField pasw = new JTextField();
		pasw.setBounds(330, 380, 200, 20);
		
		JLabel password = new JLabel("password:");
		password.setFont(new Font("Tahoma", Font.BOLD, 18));
		password.setBounds(200, 350, 150, 80);
		
		add(password);
		add(pasw); 
		
		JTextField fifth = new JTextField();
		fifth.setBounds(330,430, 200, 20);
		JLabel confirm = new JLabel("confirm pass:");
		confirm.setFont(new Font("Tahoma", Font.BOLD, 18));
	    confirm.setBounds(200, 400, 150, 80);
		
		add(fifth);
		add(confirm);
		
		btn.setBounds(430, 500, 100, 30);
		 ImageIcon arrow = null;
		 
		add(btn);
		
		btn1.setBounds(230, 500, 100, 30);
		add(btn1);
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String user_name = user.getText();
				String passwd = pasw.getText();
				String firstname = first.getText();
				String lastname = second.getText();
				String thirdd = third.getText();
				String fourthh = forth.getText();
				String fifthh = fifth.getText();
				
				if(user_name.isEmpty()|passwd.isEmpty()|firstname.isEmpty()|lastname.isEmpty()|thirdd.isEmpty()|fourthh.isEmpty()| fifthh.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Fill all the required fileds");
				}
				else {
				try {
		            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/images","root", "Aman@1012");
		            String query = "INSERT INTO register(username, password) VALUES(?,?)";
		            PreparedStatement st = con.prepareStatement( query);
		            st.setString(1, user_name);
		            st.setString(2,  passwd);
		            if(st.executeUpdate()>0) {
		            	JOptionPane.showMessageDialog(null, "User successfully added");
		            }

				}
				catch(SQLException ex) {
					ex.printStackTrace();
				}
				dispose();
				
			}
		}
		}
		
				);
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new loginpage().setVisible(true);
				
			}
		});
		setSize(900, 600);
		setLayout(null);
		ImageIcon back = new ImageIcon("C:/Users/91761/eclipse-workspace/ticket_booking_system/src/ticket_booking_system/download.jpg");
		Image img = back.getImage();
		Image temp_img = img.getScaledInstance(900,600,Image.SCALE_SMOOTH);
		back = new ImageIcon(temp_img);
		JLabel background = new JLabel("",back,JLabel.CENTER);
		background.setBounds(0, 0, 900, 600);
		add(background);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
	public static void main(String[] args) {
		new register();
	}

}

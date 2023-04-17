package images;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.*;
public class loginpage extends JFrame{
 loginpage(){
		
		JButton btn = new JButton("login");
		JLabel book = new JLabel("Bookmyseat");
		book.setFont(new Font("Tahoma", Font.CENTER_BASELINE, 35));
		book.setBounds(300, 40, 250, 80);
		add(book);
		JTextField user = new JTextField();
		user.setBounds(350,180, 200, 30);
		JLabel username = new JLabel("Username:");
		username.setFont(new Font("Tahoma", Font.BOLD, 22));
		username.setBounds(200, 150, 150, 80);
		
		add(username);
		add(user);
		
		
		JTextField pasw = new JTextField();
		pasw.setBounds(350, 230, 200, 30);
		JLabel password = new JLabel("password:");
		password.setFont(new Font("Tahoma", Font.BOLD, 22));
		password.setBounds(200, 200, 150, 80);
		
		add(password);
		add(pasw); 
		btn.setBounds(390, 300, 70, 30);
		 ImageIcon arrow = null;
	     JButton btn1 = new JButton(arrow); 
	     btn1.setText("Register new user");
	     
		 btn1.setBounds(350, 340, 150, 30);
		 
		add(btn);
		add(btn1);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String user_name = user.getText();
				String passwd = pasw.getText();
				ResultSet rs;
				if(user_name.isEmpty()) {
					JOptionPane.showMessageDialog(null, "username can't be blank." );
				}
				else {
				try {
		            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/images","root", "Aman@1012");
		            String query = "SELECT * FROM register WHERE username = ? AND password =?";
		            PreparedStatement st = con.prepareStatement( query);
		            st.setString(1, user_name);
		            st.setString(2,  passwd);
		            rs = st.executeQuery();
		            if(rs.next()) {
		            	JOptionPane.showMessageDialog(null, "Welcome  "+user_name );
		            	new chooseoption().setVisible(true);
		            }
		            else {
		            	JOptionPane.showMessageDialog(null, "Wrong pawwsd" );
		            }

				}
				
				catch(SQLException ex) {
					ex.printStackTrace();
				
				
			}
				}
		}
			}
		);
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				new register().setVisible(true);
				
			}
		}
			);
		setSize(900, 600);
		setLayout(null);
		ImageIcon back = new ImageIcon("C:/Users/91761/eclipse-workspace/Poornima/src/ticket.jpg");
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
		new loginpage();
	}

}

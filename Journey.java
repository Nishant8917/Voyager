package images;




import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Journey extends JFrame{
     Journey(){
    	JLabel book = new JLabel("Journey");
		book.setFont(new Font("Tahoma", Font.CENTER_BASELINE, 35));
		book.setBounds(380, 100, 300, 80);
		add(book);
		JTextField From = new JTextField();
		From.setBounds(200, 300, 200, 30);
		//From.setText();
		From.setEditable(true);
		add(From);
		JLabel to = new JLabel("To ->");
		to.setFont(new Font("Tahoma", Font.BOLD, 22));
		to.setBounds(420, 299, 150, 30);
		add(to);
		JTextField desti = new JTextField();
		desti.setBounds(500, 300, 200, 30);
		//desti.setText();
		desti.isEditable();
		add(desti);
		 
    	JButton Search = new JButton("Search");
    	Search.setBounds(370, 400, 80, 40);
    	add(Search);
    	Search.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String from = From.getText();
				String dest = desti.getText();
				if(from.isEmpty() | dest.isEmpty() ) {
					JOptionPane.showMessageDialog(null, "Please enter correct details");
				}
				else {
			    	
				new display().setVisible(true);
				}
			}
		});
//    	
//    	ImageIcon bus = new ImageIcon("C:/Users/91761/eclipse-workspace/ticket_booking_system/src/ticket_booking_system/bus.jpg");
//    	Image cd = bus.getImage();
//    	Image temp_bus = cd.getScaledInstance(210, 180, Image.SCALE_SMOOTH);
//    	bus = new ImageIcon(temp_bus);
//    	JButton btn2 = new JButton("Bus" , bus);
//    	btn2.setBounds(150, 320, 180, 180);
//    	add(btn2);
//    	
//    	ImageIcon train = new ImageIcon("C:/Users/91761/eclipse-workspace/ticket_booking_system/src/ticket_booking_system/train.jpg");
//    	Image ef = train.getImage();
//    	Image temp_train = ef.getScaledInstance(210, 180, Image.SCALE_SMOOTH);
//    	train = new ImageIcon(temp_train);
//    	JButton btn3 = new JButton("Train", train);
//    	btn3.setBounds(450, 80, 180, 180);
//    	add(btn3);
//    	
//
//    	ImageIcon cab = new ImageIcon("C:/Users/91761/eclipse-workspace/ticket_booking_system/src/ticket_booking_system/cab.jpg");
//    	Image gh = cab.getImage();
//    	Image temp_cab = gh.getScaledInstance(210, 180, Image.SCALE_SMOOTH);
//    	cab = new ImageIcon(temp_cab);
//    	JButton btn4 = new JButton("Cab", cab);
//    	btn4.setBounds(450, 320, 180, 180);
//    	add(btn4);
    	
    	JButton btn5 = new JButton("Cancel");
    	btn5.setBounds(470, 400, 80, 40);
    	add(btn5);
    	btn5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			    	
				new chooseoption().setVisible(true);
			}
		});
    	
    	setSize(900,600);
    	setLayout(null);
    	ImageIcon ch = new ImageIcon("C:/Users/91761/eclipse-workspace/ticket_booking_system/src/ticket_booking_system/download.jpg");
    	Image img = ch.getImage();
    	Image temp_image = img.getScaledInstance(900, 600, Image.SCALE_SMOOTH);
    	ch = new ImageIcon(temp_image);
    	JLabel ak = new JLabel("", ch, JLabel.CENTER);
    	ak.setBounds(0,0, 900, 600);
    	add(ak);
    	setVisible(true);
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
    	
    }
	public static void main(String[] args) {
		new Journey();
	}

}

package images;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class display extends JFrame{
	display(){
		JLabel bus_name = new JLabel("Bus Name");
		bus_name.setFont(new Font("Garamond", Font.CENTER_BASELINE, 15));
		bus_name.setBounds(90, 80, 100, 30);
		add(bus_name);
		
		JLabel fare = new JLabel("Fare");
		fare.setFont(new Font("Garamond", Font.CENTER_BASELINE, 15));
		fare.setBounds(400, 80, 100, 30);
		add(fare);
		
		JLabel fare_charge = new JLabel(Buses.Charge());
		fare_charge.setFont(new Font("Helvetica", Font.CENTER_BASELINE, 25));
		fare_charge.setBounds(400, 120, 100, 30);
		add(fare_charge);
	
		JLabel text = new JLabel();
		text.setText("         "+Buses.Bus());
		text.setFont(new Font("Helvetica", Font.CENTER_BASELINE, 25));
		text.setBounds(1000, 100, 120, 40);
		add(text);
		setSize(600, 300);
		setVisible(true);
		
		
		
		
	}
public static void main(String[] args) {
	new display();
}

}

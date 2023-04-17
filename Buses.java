package images;

import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
public class Buses {
    
        // creating ArrayList
    	public static String Bus(){
    		
        ArrayList<String> my_list = new ArrayList<String>();
  
        // adding elements
        my_list.add("VRL Travels");
        my_list.add("SRS TRavels");
        my_list.add("Senorita Travels");
        my_list.add("Amsm Travels");
        my_list.add("Kallada Travels");
        my_list.add("Heak Travels");
        my_list.add("Tam Travels");
        my_list.add("Shruti Travels");
  
        // using collections.shuffle to shuffle elements of
        // ArrayList
       
        int index = (int)(Math.random()*my_list.size());
        String name = my_list.get(index);
  
        // using for each loop to print values at random
        System.out.println(name);
        return name;
        
       
        
    	}
    	public static String Charge() {
    		int max = 1000;
    		int min = 300;
    		Random random = new Random();
    		int i = min + random.nextInt(max-min);
    		String charge = Integer.toString(i);
    		return charge;
    	}
    	public static void main(String[] args){
    		Bus();
        
    }
}
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;  
public class readcsv 
{  
public static String readcsv1() throws Exception  
{  
        Scanner sc = new Scanner(new File("D:\\sanchit\\download\\personality\\Personality-prediction-system-master\\output.csv"));  
        sc.useDelimiter(",");  
        ArrayList<String> personality = new ArrayList<String>();
        while (sc.hasNext())  
        {  
            
            personality.add(sc.next());

        }  
        String person = personality.get(2);
        //System.out.print(person); 
        
        return person;
    }  
}  
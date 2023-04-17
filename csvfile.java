import java.io.*;
import com.opencsv.*;
import java.util.*;
public class csvfile{
public void csvinput(String[] data)
{

    File file = new File("D:\\sanchit\\download\\personality\\Personality-prediction-system-master\\test dataset.csv");
    try {
        // create FileWriter object with file as parameter
        FileWriter outputfile = new FileWriter(file);
  
        // create CSVWriter object filewriter object as parameter
        CSVWriter writer = new CSVWriter(outputfile);
  
        // adding header to csv
        String[] header = { "Gender", "Age", "openness","neuroticism","conscientiousness","agreeableness","extraversion","" };
        writer.writeNext(header);
  
        // add data to csv
        //Personality obj = new Personality();
        //ArrayList<String> data = obj.return_data();
        //System.out.println(data);
        //String[] data1 = {gender,age,open,nuero,consci,agree,extra};
        writer.writeNext(data);
        //s.close();
        // closing writer connection
        writer.close();
    }
    catch (IOException e) {
        
        e.printStackTrace();
    }
}
}

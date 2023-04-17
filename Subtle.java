import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.*;

public class Subtle {
    public static ArrayList<String> getSubtle(String place)  {

        ArrayList<String> Subtle_List = new ArrayList<String>();

       
        
        try{
            
        
        
        final String url ="https://so.city/delhi/article/8-out-of-the-box-fun-activities-to-enjoy-with-your-squad-in-delhi-ncr";
        Document doc;
       
        doc = Jsoup.connect(url).get();
        
        
       
        for(Element res : doc.select("div.row.article-container.shadow-left h3")){
            String name = res.select("strong").text();
            

            String x = name.substring(3);
            

            
            Subtle_List.add(x);
        }
    

    
    }
        catch(IOException ex){
            ex.printStackTrace();
        }
       

        return Subtle_List;

    }
    public static void main(String[] args)  {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a place");
        String place = s.next();
        getSubtle(place);
        s.close();
    }
}
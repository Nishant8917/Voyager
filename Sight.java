import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Document;
import java.util.*;

public class Sight {
    public static ArrayList<String> getSight(String place) {
        ArrayList<String> sight_list = new ArrayList<String>();

       
        
        try{
            
        
        
        final String url ="https://www.justdial.com/"+place+"/Tourist-Attraction/nct-10596038";
        final Document doc = Jsoup.connect(url).get();
        
     
        for(Element res : doc.select("ul.rsl.col-md-12.padding0 div.col-md-12.col-xs-12.colsp ")){
            String name = res.select("h2.store-name").text();
            
            
            sight_list.add(name);

        
          

        }
    }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return sight_list;


    
}

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a place");
        String place = s.next();
        getSight(place);
        s.close();


    }
}
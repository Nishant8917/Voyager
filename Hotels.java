import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Document;
import java.util.*;

public class Hotels{
    public static ArrayList<String> getHotel(String place) {
        ArrayList<String> tem_list = new ArrayList<>();

       
        
        try{
            
        
        
        final String url ="https://www.google.com/search?q=Hotels+in+"+place+"&biw=896&bih=726&tbm=lcl&sxsrf=ALiCzsaCdLhnp_jUe7hz4yBMs9Z_NmqttA%3A1655355130660&ei=-raqYoLxJ_3az7sP37GciAY&oq=temples+in+noida&gs_l=psy-ab.3..35i39k1j0i30i22k1l4j0i30i15i22k1j0i30i22k1l3j0i30i15i22k1.269839.270571.0.270772.5.5.0.0.0.0.258.258.2-1.1.0....0...1.1.64.psy-ab..4.1.257....0.BqLCpiiLhXk";
        final Document doc = Jsoup.connect(url).get();
        //System.out.println("Monuments :");
     
        for(Element res : doc.select("div#center_col.s6JM6d div.dbg0pd.eDIkBe ")){
            String name = res.select("span.OSrXXb").text();
            
            tem_list.add(name);
            //System.out.println(name);

        
          

        }
    }
        catch(Exception ex){
            ex.printStackTrace();
        }
        //return Monuments_list;

        return tem_list;
    
}

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a place");
        String place = s.next();
        s.close();
        getHotel(place);
    }

    
}
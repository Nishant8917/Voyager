import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Document;
import java.util.*;

public class monuments {
    public static ArrayList<String> Monuments(String place) {

        ArrayList<String> Monuments_list = new ArrayList<String>();

       
        
        try{
            
        
        
        final String url ="https://www.google.com/search?q=historical+monuments+of+"+place+"&biw=1536&bih=726&tbm=lcl&sxsrf=ALiCzsbuVyNlYWxCCPGb4WglsOA6GRKdDg%3A1655272807387&ei=Z3WpYvynF7Cp4t4PlPykqAI&oq=historical+monuments+of+"+place+"&gs_l=psy";
        final Document doc = Jsoup.connect(url).get();
        //System.out.println("Monuments :");
     
        for(Element res : doc.select("div#center_col.s6JM6d div.dbg0pd.eDIkBe ")){
            String name = res.select("span.OSrXXb").text();
            
            
            Monuments_list.add(name);

        
          

        }
    }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return Monuments_list;


    
}

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a place");
        String place = s.next();
        Monuments(place);
        s.close();


    }
}
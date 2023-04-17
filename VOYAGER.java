import java.util.*;




public class VOYAGER{
    //static char p;
    static String personality="";
    static String allTxt = "";
    static ArrayList<String> allTxtList =  new ArrayList<String>();
    static String allTextList ="";
    public static void personality1(){

       
        //csvfile.csvinput();
        

        
        try{
            cmd.cmd1();
        }
        catch(Exception e){
            System.out.println("ERROR");
        }
        try{
            personality=readcsv.readcsv1();
        }
        catch(Exception e){
            System.out.println("ERROR");
        }
        
        //System.out.println(personality);
    }
        
        


        
        //System.out.println(p+"hello");
        public static String displayResult(String place,char p){

        
        if(p=='r'){
            
            ArrayList <String> temples = Mandir.getTemple(place);
            ArrayList <String> monuments_list = monuments.Monuments(place);
            ArrayList<String> cafe_list = cafes.getCafe(place);
            ArrayList<String> sight_list = Sight.getSight(place);
            ArrayList<String> hotel_list = Hotels.getHotel(place);
            for(int i=0;i<5;i++){

            allTxt="PACKAGE "+(i+1)+":\n\n"+"TEMPLE: "+temples.get(i)+"\nMONUMENT: "+monuments_list.get(i)+"\nCAFE: "+cafe_list.get(i)+"\nSIGHTSEEING: "+sight_list.get(i)+"\nHOTEL: "+hotel_list.get(i)+"\n\n";
            allTxtList.add(allTxt);
            
        }
            
        
        }

        else if(p=='s'){
            
            ArrayList <String> temples = Mandir.getTemple(place);
            ArrayList <String> monuments_list = monuments.Monuments(place);
            ArrayList<String> res_list = restaurants.getRes(place);
            ArrayList<String> museum_list = museum.getMuseum(place);
            ArrayList<String> hotel_list = Hotels.getHotel(place);
            for(int i=0;i<5;i++){
                allTxt = "PACKAGE "+(i+1)+":\n\n"+ "TEMPLE: "+temples.get(i)+"\nMONUMENT: "+monuments_list.get(i)+ "\nFamily Restaurants: "+res_list.get(i)+"\nMuseum: "+museum_list.get(i)+"\nHOTEL: "+hotel_list.get(i)+"\n\n";
                allTxtList.add(allTxt);
                
        }
            
        
        }

        else if(p=='e'){
            
            ArrayList <String> adventure_list = adventure.getAdventure(place);
            ArrayList <String> monuments_list = monuments.Monuments(place);
            ArrayList<String> club_list = clubs.getClub(place);
            ArrayList<String> shopping_list = shopping.getShop(place);
            ArrayList<String> hotel_list = Hotels.getHotel(place);
            for(int i=0;i<5;i++){
                allTxt = "PACKAGE "+(i+1)+":\n\n"+ "\nADVENTURE SPORTS: "+adventure_list.get(i)+"\nHOTEL: "+hotel_list.get(i)+ "\nCLUBS: "+club_list.get(i)+"\nMONUMENT: "+monuments_list.get(i)+"\nSHOPPING: "+shopping_list.get(i)+"\n\n";
                allTxtList.add(allTxt);
            
        }
            
        
        }

        else if(p=='d'){
            
            ArrayList <String> adventure_list = adventure.getAdventure(place);
            ArrayList <String> sight_list = Sight.getSight(place);
            ArrayList<String> subtle_list = Subtle.getSubtle(place);
            ArrayList<String> cafe_list = cafes.getCafe(place);
            ArrayList<String> hotel_list = Hotels.getHotel(place);
            for(int i=0;i<5;i++){
                allTxt = "PACKAGE "+(i+1)+":\n\n"+"\nADVENTURE SPORTS: "+adventure_list.get(i)+"\nHOTEL: "+hotel_list.get(i)+"\nCAFE: "+cafe_list.get(i)+"\nSIGHTSEEING: "+sight_list.get(i)+"\nSUBTLE ACTIVITIES: "+subtle_list.get(i+1)+"\n\n";
                allTxtList.add(allTxt);
        }
            
        
        }

        else if(p=='l'){
            
            ArrayList <String> adventure_list = adventure.getAdventure(place);
            ArrayList <String> night_list = Night.getNight(place);
            ArrayList<String> shop_list = shopping.getShop(place);
            ArrayList<String> res_list = restaurants2.getRes(place);
            ArrayList<String> hotel_list = Hotels.getHotel(place);
            for(int i=0;i<5;i++){
                allTxt = "PACKAGE "+(i+1)+":\n\n"+"\nADVENTURE SPORTS: "+adventure_list.get(i)+"\nHOTEL: "+hotel_list.get(i)+"\nRESTAURANTS: "+res_list.get(i)+"\nNIGHTLIFE: "+night_list.get(i)+"\nSHOPPING PLACES: "+shop_list.get(i)+"\n\n";
                allTxtList.add(allTxt);
           
        }
            
        
        }
        allTextList = allTxtList.toString().replace(",", "").replace("[", "").replace("]","");

        return allTextList;

    }


    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a place");
        String place = s.next();
        s.close();
        VOYAGER.personality1();
        char p = personality.charAt(0);
        VOYAGER.displayResult(place, p);
    }


}
   

           
        
        
       
        
    

    
       
        
        

    
            
        


    

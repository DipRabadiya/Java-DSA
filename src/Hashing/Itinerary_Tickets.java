package Hashing;
import java.util.*;
public class Itinerary_Tickets {
    public static String getStart(HashMap<String,String> ticket){
        HashMap<String,String> revMap = new HashMap<>();

        for(String key : ticket.keySet()){
            revMap.put(ticket.get(key),key);
        }

        for(String key : ticket.keySet()){
            if(!revMap.containsKey(key)){
                return  key;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        HashMap<String,String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");
        tickets.put("Bengaluru", "Ahmedabad");
        tickets.put("Ahmedabad","Ayodhya");

        String start=getStart(tickets);

        while(tickets.containsKey(start)) {
            System.out.print(start + "-->");
            start = tickets.get(start);
        }
        System.out.println(start);
    }
}
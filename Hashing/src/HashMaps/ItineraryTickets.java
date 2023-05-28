package HashMaps;

import java.util.HashMap;

public class ItineraryTickets {
    public static void main(String[] args) {
        HashMap<String,String> tickets = new HashMap<>();

        tickets.put("Chennai","Bangalore");
        tickets.put("Mumbai","Delhi");
        tickets.put("Goa","Chennai");
        tickets.put("Delhi","Goa");

        String start = start(tickets);

        while(tickets.containsKey(start)){
            System.out.print(start + "->");
            start = tickets.get(start);
        }

        System.out.println(start);
    }

    static String start (HashMap<String,String> tick){

        HashMap<String,String> revMap = new HashMap<>();

        for(String key : tick.keySet()){
            // here for revMap, key will be tick's value and value will be tick's key
            revMap.put(tick.get(key), key);
        }

        for (String key : tick.keySet()) {
            if(! revMap.containsKey(key)){
                return key;
            }
        }
        return null;
    }
}

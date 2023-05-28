package HashMaps;

import java.util.HashMap;
import java.util.Map;

public class Intro {
    public static void main(String[] args) {

        //initialization
        HashMap<String, Integer> map = new HashMap<>();

        //Insert

        map.put("India", 120);
        map.put("China", 420);
        map.put("Nepal", 1);

        System.out.println(map);


        //if a key is reinserted

        map.put("China", 420); // as the key and value pair are same as before, thatswhy they are skipped

        map.put("China", 200 ); // if the value is different for the same key then that key's value is updated


        //Seraching

        if(map.containsKey("China")){
            System.out.println("Present");
        }else
            System.out.println("not present");

        //to print the value of the corresponding key

        System.out.println(map.get("China"));

        int[] arr = {1,2,3,4,5};

        for(int val : arr){
            System.out.print(val+" ");
        }
        System.out.println();

        //similarly for HashMaps

        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.println(e.getKey());     //for key
            System.out.println(e.getValue());       //for value
        }

        //Deletion
        map.remove("China");
        System.out.println(map);
    }
}

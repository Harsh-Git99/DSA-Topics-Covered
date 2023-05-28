package String.Medium;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class sortCharactersByFrequency {
    public static void main(String[] args) {
        String s = "raaeaedere";
        System.out.println(sortCharacters(s));
    }

    static String sortCharacters(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        List<Character>[] list  = new List[s.length()-1];

        // create a HashMap and put the characters and their frequencies.
        for(char ch : s.toCharArray()){
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }else{
                map.replace(ch,map.get(ch)+1);
            }
        }

        // put the characters according to their freq as index of list[]
        for(char ch : map.keySet()){
            int freq = map.get(ch);
            if(list[freq] == null){
                list[freq] = new ArrayList<>();
            }list[freq].add(ch);
        }

        StringBuilder sb = new StringBuilder();


        for (int i = list.length-1; i >= 0 ; i--) {
            if(list[i] != null){
                for(char ch : list[i]){
                    for (int j = 0; j < map.get(ch); j++) {
                        sb.append(ch);
                    }
                }
            }
        }
        return sb.toString();
    }
}

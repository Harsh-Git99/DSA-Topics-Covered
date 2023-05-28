package Strings.Medium;

import java.util.*;

public class SortCharactersByFrequency {
    public static void main(String[] args) {

        String s = "raaeaedere";
        System.out.println(frequencySort2(s));
    }

    //optimized solution
    static String frequencySort2(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        List<Character>[] bucket = new List[s.length()+1];


        for(char ch : s.toCharArray()){
            map.put(ch, (map.getOrDefault(ch,0))+1);
        }

        for(char ch : map.keySet()){
            int freq = map.get(ch);
            if(bucket[freq] == null){
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(ch);
        }
        StringBuilder sb = new StringBuilder();

        for (int i = bucket.length-1; i >=0 ; i--) {
            if(bucket[i] != null){
                for(char ch : bucket[i]){
                    for (int j = 0; j < map.get(ch); j++) {
                        sb.append(ch);
                    }
                }
            }
        }
        return sb.toString();
    }



    static String frequencySort(String s) {
        StringBuilder sb = new StringBuilder();
        HashMap<Character, Integer> map = new HashMap<>();
        PriorityQueue<Character> pq = new PriorityQueue<>((x,y)-> map.get(y)- map.get(x));//https://stackoverflow.com/questions/57204012/confused-about-this-line-in-priority-queue
        for(char c : s.toCharArray()){
            map.put(c,(map.getOrDefault(c,0))+1);
        }

        for(char ch : map.keySet()){
            pq.add(ch);
        }


        while(!pq.isEmpty()){
            char ch = pq.remove();
            for (int i = 0; i < map.get(ch); i++) {
                sb.append(ch);
                
            }
        }
        return sb.toString();
    }
}

package String.Easy;

import java.util.HashMap;
import java.util.HashSet;

public class validAnagram {
    public static void main(String[] args) {
        String s = "a";
        String t = "ab";

        System.out.println(isValid2(s,t));
    }

    static boolean isValid2 (String s, String t){

        int[] sArr = new int[40];
        int[] tArr = new int [40];

        for(char ch : s.toCharArray()){
            int idx = ch - 'a';
            sArr[idx] +=1;
        }
        for(char ch : t.toCharArray()){
            int idx = ch - 'a';
            tArr[idx] +=1;
        }

        for (int i = 0; i < sArr.length; i++) {
            if(sArr[i] != tArr[i]) return false;
        }
        return true;
    }


    static boolean isValid (String s, String t){

        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch =s.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch, 1);
            }else
                map.put(ch,map.get(ch)+1);
        }

        for (int i = 0; i < t.length(); i++) {
            char ch= t.charAt(i);
            if(map.containsKey(ch)){
                if(map.get(ch) > 0){
                    map.replace(ch,map.get(ch)-1);
                }
                else return false;
            }else return false;
        }
        return true;
    }
}

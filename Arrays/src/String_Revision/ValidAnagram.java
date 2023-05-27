package String_Revision;

import java.util.Arrays;
import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        System.out.println(isAna(s,t));

    }

    static boolean isAnagram(String s, String t){

        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch= s.charAt(i);
            if(map.containsKey(ch)){
                map.replace(ch,map.get(ch),map.get(ch)+1);
            }else map.put(ch,1);
        }
        for (int i = 0; i < t.length(); i++) {
            char ch2 = t.charAt(i);
            if(map.containsKey(ch2)){
                map.replace(ch2, map.get(ch2), map.get(ch2)-1);
                if(map.get(ch2)==0){
                    map.remove(ch2);
                }
            }else return false;
        }
        return map.isEmpty();
    }

    static  boolean isAna(String s, String t){

        s = s.replaceAll("\\s+","");
        t = t.replaceAll("\\s+","");

        char[] chAr1 = s.toCharArray();
        Arrays.sort(chAr1);
        char[] chAr2 = t.toCharArray();
        Arrays.sort(chAr2);

        for (int i = 0; i < chAr2.length; i++) {
            if(chAr1[i] != chAr2[i]){
                return false;
            }
        }
        return true;
    }
}

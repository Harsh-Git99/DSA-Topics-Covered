package HashMaps;

import java.util.HashMap;
import java.util.Iterator;

public class Isomorphic {
    public static void main(String[] args) {
        String str1 = "badc";
        String str2 = "baba";

        System.out.println(isoMorphic(str1,str2));

    }

    static boolean isoMorphic(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }


        HashMap<Character,Character> map1 = new HashMap<>();
        HashMap<Character,Boolean> map2 = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            if(map1.containsKey(s1.charAt(i))){
                if(map1.get(s1.charAt(i)) != s2.charAt(i)){
                    return false;
                }
            }else{
                if(map2.containsKey(s2.charAt(i))){
                    return false;
                }else {
                    map1.put(s1.charAt(i), s2.charAt(i));
                    map2.put(s2.charAt(i),true );
                }

            }

        }


        return true;
    }
}

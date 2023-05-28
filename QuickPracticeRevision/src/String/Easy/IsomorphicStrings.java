package String.Easy;

import java.util.HashMap;

public class IsomorphicStrings {
    public static void main(String[] args) {
        String s1 = "bbbaaaba";
        String s2 = "aaabbbba";

        System.out.println(isIso(s1, s2));

    }

    static boolean isIso(String s1, String s2) {
        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Boolean> map2 = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);
            if (!map1.containsKey(ch1) && !map2.containsKey(ch2)) {
                map1.put(ch1,ch2);
                map2.put(ch2,true);
            } else if (map1.containsKey(ch1) && map1.get(ch1) == ch2 && map2.containsKey(ch2)) {
                continue;
            }else return false;
        }
        return true;
    }


    static boolean isIso2(String s1, String s2) {
        HashMap<Character, Character> map = new HashMap<>();
        HashMap<Character, Boolean> map2 = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);
            if (map.containsKey(ch1) && map2.containsKey(ch2)) {
                if (map.get(ch1) != ch2) {
                    return false;
                }
            } else if (!map.containsKey(ch1) && map2.containsKey(ch2)) {
                return false;
            } else {
                map.put(ch1, ch2);
                map2.put(ch2, true);
            }
        }
        return true;
    }
}

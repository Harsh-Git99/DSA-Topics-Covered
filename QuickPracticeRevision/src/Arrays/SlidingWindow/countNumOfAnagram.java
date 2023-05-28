package Arrays.SlidingWindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class countNumOfAnagram {
    public static void main(String[] args) {
        String str = "aabaabaa";

        String p = "aaba";

      //  System.out.println(anagram(p,""));
        //System.out.println(numAnagram(str,p));

        System.out.println(getTotalAnagrams(str,p));


    }


    static int getTotalAnagrams(String str, String p){

        HashMap<Character,Integer> map = map(p);    //mapping the pointer
        int count = map.size();

        int i =0 ;
        int j = 0;
        int k = p.length();
        int ans = 0;

        while(j < str.length()){
            char ch = str.charAt(j);
            if(map.containsKey(ch)){
                map.replace(ch,map.get(ch)-1);
                if(map.get(ch) ==0){
                    count--;
                }
            }
            if(j-i+1 < k) j++;
            else if (j-i+1 == k) {
                if(count==0) ans++;
                char ch1 = str.charAt(i);
                if(map.containsKey(ch1)){
                    map.replace(ch1,map.get(ch1)+1);
                    if(map.get(ch1) == 1) {
                        count++;
                    }
                }
                i++;
                j++;
            }
        }
        return ans;
    }




    static HashMap<Character,Integer> map (String p){
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < p.length(); i++) {
            if(!map.containsKey(p.charAt(i))){
                map.put(p.charAt(i),1);
            } else if (map.containsKey(p.charAt(i))) {
                map.replace(p.charAt(i),map.get(p.charAt(i))+1);
            }
        }
        return map;
    }













    static int numAnagram(String str, String p){
        int i = 0;
        int j = 0;

        int count = 0;

        HashSet<String> setH = anagram(p,"");

        while(j < str.length() ){
            StringBuilder sb = new StringBuilder();
            if((j-i+1) < p.length()){
                sb.append(str.substring(0,j+1));
                j++;
            } else if ((j-i+1) == p.length()) {

                sb.append(str.substring(i,j+1));

               if( setH.contains(sb.toString())) count++;


               j++;
               i++;
            }

        }
        return count;
    }


    static HashSet<String> anagram (String up, String p ){

        if(up.length() ==0){
            HashSet<String> set = new HashSet<>();
            set.add(p);
            return set;
        }

        char ch = up.charAt(0);

        HashSet<String> set = new HashSet<>();

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String l = p.substring(i,p.length());

            set.addAll(anagram(up.substring(1),f+ch+l));

        }
        return set;
    }
}

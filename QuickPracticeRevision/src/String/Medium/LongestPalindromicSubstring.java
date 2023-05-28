package String.Medium;

import java.util.ArrayList;
import java.util.Collections;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String s = "babad";


        System.out.println(getALlSubStringsRecursive(s,""));

        System.out.println(longestPalindrome(s));
      //  System.out.println(getALlSubStrings(s));
    }

    //all the substring possible

    static String longestPalindrome(String s) {
        String ans = "";
        int length=0, maxLength =0;
        ArrayList<String> list = getALlSubStrings(s);
        for(String ele : list){
            if(isPalindrome(ele)){
                length = ele.length();
                if(length > maxLength){
                    maxLength=length;
                    ans = ele;
                }
            }
        }
        return ans;
    }

    static ArrayList<String> getALlSubStringsRecursive(String up, String p){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();

            list.add(p);

            return list;
        }

        //ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < up.length(); i++) {
            String ch = String.valueOf(up.charAt(i));
            ArrayList<String> list = (getALlSubStringsRecursive(up.substring(1),p+ch));
        }
        ArrayList<String> list2 = (getALlSubStringsRecursive(up.substring(1),""));

        return list2;
    }




    //This works but takes O(n^2) time complexity
    static ArrayList<String> getALlSubStrings(String s){
        String ans = "";
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            ans = String.valueOf(s.charAt(i));
            list.add(ans);
            for (int j = i+1; j < s.length(); j++) {
                 ans +=   String.valueOf(s.charAt(j));
                 list.add(ans);
            }
            ans= "";
        }
        return list;
    }


    static boolean isPalindrome(String s){
        int i =0;
        int j = s.length()-1;
       while(i < s.length() && j >= 0){
           if(s.charAt(i) != s.charAt(j)){
               return false;
           }
           i++;
           j--;
       }
       return true;
    }
}

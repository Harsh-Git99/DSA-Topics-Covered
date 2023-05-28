package Strings;

import java.util.Arrays;
public class LongestCommonPrefix {
    public static void main(String[] args) {

        String[] strs = {"flower","flow","flight"};

        System.out.println(longestCommonPrefix1(strs));

        //System.out.println(commonPrefix(strs));

      // System.out.println(longestCommonPrefix(strs));
    }

    static String longestCommonPrefix1(String[] strs) {
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = strs[0].substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }
    static String commonPrefix(String[] str){
        Arrays.sort(str);       // it compares each alphabet of the index string


        String first = str[0];

        String last = str[str.length-1];
        int c =0;

        while(c<first.length()){
            if(first.charAt(c)==last.charAt(c)){
                c++;
            }
            else
                break;
        }
        if(c==0){
            return "";
        }
        return first.substring(0,c);
    }
    static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";

        Arrays.sort(strs);

        String first = strs[0];

        String last = strs[strs.length - 1];
        int c = 0;
        while(c < first.length())
        {
            if (first.charAt(c) == last.charAt(c))
                c++;
            else
                break;
        }
        return c == 0 ? "" : first.substring(0, c);
    }
}


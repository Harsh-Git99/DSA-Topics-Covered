package String_Revision;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String [] str = {"geeksforgeeks", "geeks", "geek","geezer"};

        System.out.println(longestCommon(str));
    }

    static String longestCommon(String[] str){

        Arrays.sort(str);
        String first = str[0];
        String last = str[str.length-1];

        int c = 0;
        while(c < first.length()){
            if(first.charAt(c) == last.charAt(c)){
                c++;
            }else break;
        }
        if(c==0){
            return "";
        }else return first.substring(0,c);
    }
}

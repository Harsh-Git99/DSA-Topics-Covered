package LeetCodeWeekly;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VowelsInSubstring {
    public static void main(String[] args) {
        String s = "abciiidef";
        int k = 3;

        System.out.println(maxVowels2(s,k));
    }

    static int maxVowels2(String s, int k) {
        int i = 0, j = 0, count=0;
        int maxCount = Integer.MIN_VALUE;


        while(j<s.length()){
            //calculations

            char ch = s.charAt(j);

            if(isVowel(ch)){
                count++;
            }

            //while j<k
            if(j-i+1<k){
                j++;
            }else if(j-i+1 == k){
                //calculations

                if(count>maxCount) maxCount = count;


                //if charAt(i) is a vowel then we will have to reduce count before sliding the window

                if(isVowel(s.charAt(i))) count--;

                //slide the window
                j++;
                i++;


            }
        }
        return maxCount;
    }

    static boolean isVowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i'|| ch == 'o'|| ch == 'u' ){
            return true;
        }
        return false;
    }

    static int maxVowels(String s, int k) {
        int i = 1, j = 1, count=0;
        int maxCount = Integer.MIN_VALUE;
        String vowelRegex = "[aeiouAEIOU]";
        Pattern pattern = Pattern.compile(vowelRegex);
        while(j<s.length()){
            //calculations

            char ch = s.charAt(j);
            Matcher matcher = pattern.matcher(String.valueOf(ch));

            if(matcher.matches() ){
                count++;
            }

            //while j<k
            if(j<k){
                j++;
            }else if(j >= k){
                //calculations

                if(count>maxCount) maxCount = count;


                //if charAt(i) is a vowel then we will have to reduce count before sliding the window
                matcher = pattern.matcher(String.valueOf(s.charAt(i)));
                if(matcher.matches()) count--;

                //slide the window
                j++;
                i++;


            }
        }
        return maxCount;
    }
}

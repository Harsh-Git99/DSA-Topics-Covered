package Strings;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "rac";
        String str2 = "car";

        System.out.println(isAnagram(str1,str2));


        //optimised
        System.out.println(isAnagram2(str1,str2));
    }

    static boolean isAnagram(String str1, String str2){
        str1=str1.replaceAll("\\s", "");
        str2=str2.replaceAll("\\s", "");
        if(str1.length() != str2.length()){
            return false;
        }
        StringBuilder sb = new StringBuilder(str2);
        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < sb.length(); j++) {
                if(str1.charAt(i)==sb.charAt(j)){
                    sb.deleteCharAt(j);
                    break;
                }
            }
        }
        if(sb.length()==0){
            return true;
        }
        return false;
    }

    static boolean isAnagram2(String str1, String str2){

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if(ch1.length!=ch2.length){
            return false;
        }
        int i=0,j=0;

        while(i < ch1.length && j < ch2.length){
            if(ch1[i]!=ch2[j]){
                return false;
            }
            i++;
            j++;
        }
        return true;
    }
}

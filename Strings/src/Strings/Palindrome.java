package Strings;

import java.util.Arrays;

public class Palindrome {
    public static void main(String[] args) {

        String st = null;
        System.out.println(isPalindrome2(st));
    }
    static boolean isPalindrome(String str){
        if(str==null || str.length()==0){
            return true;
        }
        str = str.toLowerCase();
        for (int i = 0; i < str.length()/2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length()-1-i);
            if (start != end){
                return false;
            }
        }
        return true;
    }

    //using while loop
    static  boolean isPalindrome2(String str){

        if(str==null || str.length()==0){
            return true;
        }
        //convert string to lower case
        str = str.toLowerCase();
        //convert String to char to compare every single alphabet
        char [] ch = str.toCharArray();
        int start =0 ;
        // end is till the length of char 0 to length-1
        int end = str.toCharArray().length-1;
        while(start < end){
            if(ch[start]!=ch[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

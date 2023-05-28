package Strings;

import java.util.Arrays;

public class ReverseWordsInAString {
    public static void main(String[] args) {
        String st = "     the    sky    is blue     ";

        System.out.println(reverseWords(st));
        //OR
        System.out.println(reverseWord(st));

    }

    static String reverseWords(String s) {
        String[] a = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        String temp = a[0];
        for (int i = a.length-1; i >=1 ; i--) {
            if(a[i]==""){
                continue;
            }else {

                sb.append(a[i]);
                sb.append(" ");
            }

        }
        sb.append(temp);
        return sb.toString();
    }

    static String reverseWord(String s){
        String[] a = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();

        for (int i = a.length-1; i >=0 ; i--) {
            if(a[i]!=""){
                sb.append(a[i]).append(" ");

            }
        }
        String res = sb.toString();
        return res.substring(0,res.length()-1);
    }
}

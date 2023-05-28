package Strings;

import java.util.Arrays;

public class convertToUpperCase {
    public static void main(String[] args) {
        String str = "hi, this is harsh ";

        System.out.println(upperCase(str));

    }

    static  String upperCase(String str){
       char[] chArr =  str.toCharArray();
        StringBuilder sb = new StringBuilder();
       chArr[0] = Character.toUpperCase(chArr[0]);

        for (int i = 0; i < chArr.length; i++) {
            if(chArr[i] == ' ' && i < chArr.length-1){
                chArr[i+1] = Character.toUpperCase(chArr[i+1]);
            }
        }
        sb.append(chArr);
        return sb.toString();
    }
}

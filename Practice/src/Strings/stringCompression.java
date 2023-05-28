package Strings;

import java.util.Arrays;

public class stringCompression {
    public static void main(String[] args) {
        String str = "aaccd";

        char[] ch = {'a','a','b','b','c','c','c'};

        //System.out.println(Arrays.toString(str.toCharArray()));

      // System.out.println(compressString(str));

       // System.out.println(compressArray(str));
      //  System.out.println(compress(ch));

        System.out.println(compress2(ch));
    }

    static String compressString(String str){


        StringBuilder sb = new StringBuilder();

        Integer count = 1;
        for (int i = 0; i < str.length(); i++) {
            if(i < str.length()-1 &&  str.charAt(i) == str.charAt(i+1)){
                count++;
            }
            else {
                if(count>1){
                    sb.append( str.charAt(i)+ count.toString());
                }else {
                    sb.append(str.charAt(i));
                }
                count=1;
            }
        }
        return sb.toString();
    }

    static char[] compressArray(String str){

        StringBuilder sb = new StringBuilder();

        Integer count = 1;
        for (int i = 0; i < str.length(); i++) {
            if(i < str.length()-1 &&  str.charAt(i) == str.charAt(i+1)){
                count++;
            }
            else {
                if(count>1){
                    sb.append( str.charAt(i)+ count.toString());
                }else {
                    sb.append(str.charAt(i));
                }
                count=1;
            }
        }

        char[] ch = new char[sb.length()];
        sb.getChars(0,sb.length(), ch, 0);

        return ch;

    }

    static int compress(char[] chars) {
        Integer count = 1;
        int j = 0;
        for (int i = 0; i < chars.length; i++) {
            if(i<chars.length-1 && chars[i] == chars[i+1]){
                count++;
            }
            else {
                chars[j] = chars[i];
                j++;
                if (count > 1) {
                    for (char ch : count.toString().toCharArray()) {
                        chars[j] = ch;
                        j++;
                    }
                }
                count=1;
            }
        }
        return j;
    }

    static int compress2(char[] chars){

        int indexAns=0, index = 0;

        while(index < chars.length){
            char currentChar = chars[index];
            Integer count = 0;
            while(index < chars.length && chars[index] == currentChar){
                index++;
                count++;
            }
            chars[indexAns] = currentChar;
            indexAns++;
            if(count!=1){
                for(char ch : count.toString().toCharArray()){
                    chars[indexAns] = ch;
                    indexAns++;
                }
            }
        }

    return indexAns;
    }

}

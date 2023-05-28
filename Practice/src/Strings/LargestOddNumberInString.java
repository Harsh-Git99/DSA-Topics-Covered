package Strings;

public class LargestOddNumberInString {
    public static void main(String[] args) {
     String st = "3456";

     System.out.println(largestOdd1(st));

     //less Optimised
     System.out.println(largestOdd1(st));


    }

    static String largestOdd1(String s){
        for (int i=s.length() - 1; i>=0; i--) {     // we are starting from last index as if
            if(s.charAt(i) % 2 != 0){
                return s.substring(0,i+1);
            }
        }
        return "";
    }

    static String largestOdd(String s){
        char max = '0';
        String res = "" ;
        int c = 0;


        char[] chArr = s.toCharArray();

        for (int i = chArr.length-1; i >=0 ; i--) {
            c = c * 10 + (chArr[i]-48);
            if (c%2!=0){
                return s.substring(0,i+1);
            }
        }



        for( char ch : chArr){
            if(ch%2 != 0){
                if (max < ch) {
                    max = ch;
                }
            }
        }
        res = res + max;
        if(max == '0'){
            return "";
        }
        else{
            return res;
    }
    }
}

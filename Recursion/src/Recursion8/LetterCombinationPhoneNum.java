package Recursion8;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationPhoneNum {
    public static void main(String[] args) {

      //  Pnum("12", "");


            System.out.println(pNumRet("12",""));
        System.out.println("Count = "+PnumCount("12",""));

    }
    static  void Pnum (String up, String p){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0' ; // this will convert '2' into 2. (i.e. String into int)
       // System.out.println(digit);
        int start = (digit-1)*3;
        int end = digit*3;
        for (int i = start; i < end; i++) {
            char ch = (char) ('a'+ i);
            Pnum(up.substring(1),p+ch);
        }
    }

    static ArrayList<String> pNumRet (String up, String p){
        if(up.isEmpty()){

            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0' ; // this will convert '2' into 2. (i.e. String into int)
        // System.out.println(digit);
        int start = (digit-1)*3;
        int end = digit*3;
        ArrayList<String> list = new ArrayList<>();
        for (int i = start; i < end; i++) {
            char ch = (char) ('a'+ i);
           list.addAll(  pNumRet(up.substring(1),p+ch));        // after finding each answer, it is putting it in the list
                                                                                // and returning it to the above function calls
        }
        return list;
    }

    static  int PnumCount (String up, String p){
        if(up.isEmpty()){
            return 1;
        }
        int count = 0;
        int digit = up.charAt(0) - '0' ; // this will convert '2' into 2. (i.e. String into int)
        int start = (digit-1)*3;
        int end = digit*3;
        for (int i = start; i < end; i++) {
            char ch = (char) ('a'+ i);
           count= count + PnumCount(up.substring(1),p+ch);
        }
        return count;
    }
}

package striverSheetRecursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PossibleWordsPhoneDigits {
    public static void main(String[] args) {
        int[] a = {5 ,2, 4, 4, 6, 9 ,5 ,3 ,8, 7};

        System.out.println(possibleWords(a,10));
    }

    static ArrayList<String> possibleWords(int a[], int N)
    {   String up = "";
        int ans = 0;
        for (int i = 0; i < a.length; i++) {
            up +=a[i];
        }

        ArrayList<String> list = new ArrayList<>();
        sendBack(up,"", list);

        Collections.sort(list);

        System.out.println(list.size());

        return list;

    }

    static void sendBack(String up , String p, ArrayList<String> list){
        if(up.isEmpty()){
            list.add(p);
            return;
        }

        int digit = up.charAt(0)-'0';
        if(digit >= 2 && digit <= 6){
            for (int i = (digit -2)*3; i < (digit-1)*3 ; i++) {

                char ch = (char) ('A'+i) ;
                sendBack(up.substring(1),p+ch,list);
            }
        }

        if(digit ==7 ){
            for (int i = (digit -2)*3; i < ((digit-1)*3)+1 ; i++) {
                char ch = (char) ('A'+i) ;
                sendBack(up.substring(1),p+ch,list);
            }
        }
        if(digit ==8 ){
            for (int i = (digit -2)*3 +1 ; i < 22  ; i++) {

                char ch = (char) ('A'+i) ;
                sendBack(up.substring(1),p+ch,list);
            }
        }
        if(digit ==9 ){
            for (int i = 22; i < 26 ; i++) {
                char ch = (char) ('A'+i) ;
                sendBack(up.substring(1),p+ch,list);
            }
        }

    }

}

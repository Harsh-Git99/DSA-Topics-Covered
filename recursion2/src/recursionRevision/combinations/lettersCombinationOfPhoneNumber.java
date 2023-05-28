package recursionRevision.combinations;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class lettersCombinationOfPhoneNumber {
    public static void main(String[] args) {
        String s = "";
       // letters(s,"");

        System.out.println( letterCombinations(s));
       // System.out.println(lettersCount(s,""));

    }

    static List<String> letterCombinations(String s){
        if(s.isEmpty()){
            List<String> list = new ArrayList<>();
            return list;
        }

        return letterCombinationsHelper(s,"");
    }

    static List<String> letterCombinationsHelper(String up, String p){
        if(up.isEmpty()){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        List<String> list = new ArrayList<>();

        int digit = up.charAt(0)-'0';



        if(digit >= 2 && digit<=6){
            for (int i = (digit-2)*3; i < (digit-1)*3; i++) {

                char ch = (char) ('a'+i);
                list.addAll(letterCombinationsHelper(up.substring(1),p+ch));
            }
        }
        if(digit == 7){
            for (int i = 15; i < 19; i++) {

                char ch = (char) ('a'+i);
                list.addAll(letterCombinationsHelper(up.substring(1),p+ch));
            }
        }
        if(digit == 9){
            for (int i = 22; i < 26; i++) {

                char ch = (char) ('a'+i);
                list.addAll(letterCombinationsHelper(up.substring(1),p+ch));
            }
        }
        if(digit == 8){
            for (int i = 19; i < 22; i++) {
                char ch = (char) ('a'+i);
                list.addAll(letterCombinationsHelper(up.substring(1),p+ch));
            }
        }
        return list;
    }










    static void letters(String up, String p){
        if(up.isEmpty()){
            System.out.print(p + " ");
            return;
        }

        int digit = up.charAt(0) - '0'; //converts '2' into 2;
        if(digit == 1) letters(up.substring(1),p);
        if(digit >=2 && digit <=6 ){
            for (int i = (digit-2)*3 ; i < (digit-1)*3 ; i++) {
                char ch = (char) ('a'+i);
                letters(up.substring(1),p+ch);
            }
        }
        if(digit == 7){
            for (int i = 15; i < 19 ; i++) {
                char ch = (char) ('a'+i);
                letters(up.substring(1),p+ch);
            }
        }
        if(digit == 8){
            for (int i = 19; i < 22 ; i++) {
                char ch = (char) ('a'+i);
                letters(up.substring(1),p+ch);
            }
        }
        if(digit == 9){
            for (int i = 22; i < 26 ; i++) {
                char ch = (char) ('a'+i);
                letters(up.substring(1),p+ch);
            }
        }
    }

    static int lettersCount(String up, String p){
        if(up.isEmpty()){
            //System.out.print(p + " ");
            return 1;
        }

        int digit = up.charAt(0) - '0'; //converts '2' into 2;
        int count = 0;
        for (int i = (digit-1)*3 ; i < digit*3 ; i++) {

            char ch = (char) ('a'+i);

            count += lettersCount(up.substring(1),p+ch);

        }
        return count;

    }
    
}

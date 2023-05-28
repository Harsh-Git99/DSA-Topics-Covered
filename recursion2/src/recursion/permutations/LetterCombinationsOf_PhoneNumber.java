package recursion.permutations;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsOf_PhoneNumber {
    public static void main(String[] args) {
        String  digits = "12";

        System.out.println(lettersCount(digits,""));

        //letters(digits,"");

        System.out.println(letters2(digits,""));

        //System.out.println(lettersComb("abc", "def",""));

        // System.out.println(lettersCombRECURSIVELY("abc","def","",digits));


    }




    // optimised approach
    static void letters(String up, String p){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0) - '0';

        for (int i = (digit-1)*3; i < digit*3 ; i++) {
            char ch = (char) ('a' + i);
            letters(up.substring(1),p+ch);
        }

    }


// optimised approach for arrayList
    static ArrayList<String> letters2(String up, String p){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();

        int digit = up.charAt(0) - '0';

        for (int i = (digit-1)*3; i < digit*3 ; i++) {
            char ch = (char) ('a' + i);
           ans.addAll(letters2(up.substring(1),p+ch));
        }

        return ans;

    }



//resursive approach
    static ArrayList<String> lettersCombRECURSIVELY(String s, String up, String p, String digits){
        if(p.length() == digits.length() ){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        if(s.length()==0){
            return ans;
        }
        p +=  s.charAt(0);
        for (int i = 0; i < up.length(); i++) {
            p += up.charAt(i);
            ans.addAll(lettersCombRECURSIVELY(s,up.substring(1),p,digits));
            p = p.substring(0,1);
        }
        ans.addAll(lettersCombRECURSIVELY(s.substring(1),"def","",digits));
        return ans;
    }






    // iterative approach
    static ArrayList<String> lettersComb(String s, String up, String p){

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {

            for (int j = 0; j < up.length(); j++) {
                char ch1= s.charAt(i);
                p += ch1;
                char ch2 = up.charAt(j);
                p+= ch2;
                list.add(p);
                p = "";
            }
        }
        return list;
    }

    static int lettersCount(String up, String p){
        if(up.isEmpty()){

            return 1;
        }
        int  count = 0;
        int digit = up.charAt(0) - '0';

        for (int i = (digit-1)*3; i < digit*3 ; i++) {
            char ch = (char) ('a' + i);
            count = count + lettersCount(up.substring(1),p+ch);
        }
        return count;

    }
}

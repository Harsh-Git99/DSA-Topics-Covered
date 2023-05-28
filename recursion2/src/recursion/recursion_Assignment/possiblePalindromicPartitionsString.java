package recursion.recursion_Assignment;

import java.util.ArrayList;
import java.util.Arrays;

public class possiblePalindromicPartitionsString {
    public static void main(String[] args) {
        String s = "madam";

        System.out.println(  allPalindromicPerms(s));


    }

    static ArrayList<ArrayList<String>> helper (String s, String p){
        if(s.isEmpty()){
            ArrayList<String> l1 = new ArrayList<>();
            ArrayList<ArrayList<String>> list = new ArrayList<ArrayList<String>>();
            list.add(l1);
            return list;
        }

        ArrayList<ArrayList<String>> list = new ArrayList<ArrayList<String>>();
        ArrayList<String> l2 = new ArrayList<>();

        char ch = s.charAt(0) ;


        //System.out.println(ch);
        //check for palindrome
        p = p+ch;
        if(!p.isEmpty() && p.length()>1){
            String rev = "";
            for (int i = p.length()-1; i >= 0; i--) {
               rev = rev + p.charAt(i);
            }
            if(   p.equals(rev) ){
                l2.add(p);
                list.add(l2);
            }
            helper(s.substring(1),p);
        }

       helper(s.substring(1),p);


        return list;
    }

    static ArrayList<ArrayList<String>>allPalindromicPerms(String s){


        return helper(s,"");
    }
}

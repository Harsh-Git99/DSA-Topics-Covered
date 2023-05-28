package Recursion7;

import java.util.ArrayList;
import java.util.Arrays;

public class Subset {
    public static void main(String[] args) {

        String str = "abc";


        // System.out.println(SubstringReturn(" ","abc"));

        AsciiSubString("","abc");
    }
    static void SubSeq (String p, String up ){

        if (up.isEmpty()){
            System.out.println(p);
            return ;
        }

        char ch = up.charAt(0);

        SubSeq(p+ch, up.substring(1));
        SubSeq(p, up.substring(1));


    }

    //putting the values in a new Array list <string> object and returning it back
    static ArrayList<String> SubstringReturn (String p, String up){
        if(up.isEmpty()){
            ArrayList<String>  list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);

        ArrayList<String> left =  SubstringReturn(p + ch, up.substring(1));
        ArrayList<String> right =  SubstringReturn(p, up.substring(1));

        left.addAll(right);
        return left;

    }

    static void AsciiSubString (String p , String up){

        if(up.isEmpty()){
            System.out.println(p);
            return ;
        }
        char ch = up.charAt(0);

        AsciiSubString(p + ch, up.substring(1));
        AsciiSubString(p +" "+ (ch+0), up.substring(1));
        AsciiSubString(p, up.substring(1));


    }
}

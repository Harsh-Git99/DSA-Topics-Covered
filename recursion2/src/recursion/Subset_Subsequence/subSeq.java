package recursion.Subset_Subsequence;

import java.util.ArrayList;

public class subSeq {
    public static void main(String[] args) {

        String str = "abc";

       // System.out.println( subseqAsciiList("", str, '\u0000'));

        //subseq("", str);

        System.out.println(subseqList("",str));

      // subseqAscii("",str,'\u0000');
    }

    static void subseqAscii(String p, String up , char c){
        if(up.isEmpty()){
            System.out.print("->" + p + " " );
            System.out.println(c+0);    //zero is used to make it return an ascii value
            return;
        }

        // we can either take it.
        char ch = up.charAt(0);
        subseqAscii(ch+ p,  up.substring(1), (char) (ch + c));
         //or we can either ignore it.
        subseqAscii(p,  up.substring(1),   c );
    }

    static ArrayList<String> subseqAsciiList(String p, String up , char c){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            list.add(String.valueOf(c+0));
            return list;
        }

        // we can either take it.
        char ch = up.charAt(0);
        ArrayList<String > left =   subseqAsciiList(ch+ p,  up.substring(1),  (char) (ch + c));
        // or we can either ignore it.
        ArrayList<String > right =   subseqAsciiList(p,  up.substring(1),   c );

        left.addAll(right);
        return left;
    }

    static void subseq(String p, String up){
        if(up.isEmpty()){
            System.out.print("->" + p);
            return;
        }

        // we can either take it.
        char ch = up.charAt(0);
        subseq(ch+ p,  up.substring(1));
        // or we can either ignore it.
        subseq(p,  up.substring(1));
    }


    static ArrayList<String> subseqList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list; //returns to the recursive function which calls it.
        }

        // we can either take it.
        char ch = up.charAt(0);
       ArrayList<String> left =  subseqList(ch+ p,  up.substring(1));
        // or we can either ignore it.
        ArrayList<String> right =  subseqList (p,  up.substring(1));

        left.addAll(right);
        return left;
    }


}

package recursionRevision;

import java.util.ArrayList;
import java.util.List;

public class subsetString {
    public static void main(String[] args) {
        String str = "abc";

        subString(str,"");

        System.out.println();
        System.out.println(subString2(str,""));
    }

    static void subString (String up , String p){
        if(up.isEmpty()){
            System.out.print(p+" ");
            return ;
        }
        subString(up.substring(1),p+up.charAt(0));
        subString(up.substring(1),p);
    }

    static ArrayList<String> subString2 (String up , String p){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        //getting answers from the below calls
         ArrayList<String> left =   subString2(up.substring(1),p+up.charAt(0));
        ArrayList<String> right = subString2(up.substring(1),p);

        left.addAll(right);
        return left;
    }
}

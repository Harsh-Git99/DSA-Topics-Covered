package striverSheetRecursion;

import java.util.ArrayList;
import java.util.List;

public class GenerateBinaryStrings {
    public static void main(String[] args) {
        int n = 3;

        System.out.println(generateBinaryStrings(n));
    }

    static List<String> generateBinaryStrings(int n) {
        List<String> list1 = new ArrayList<>();

         helper(list1,"",n);
         return list1;

    }

    static void helper(List<String> list, String s, int max){
        if(s.length() == max){
            list.add(s);
            return;
        }

        helper(list,s+0, max );

        if(!s.isEmpty() && s.charAt(s.length()-1) == '1'){
            return;
        }

        helper(list,s+1,max);
    }
}

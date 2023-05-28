package Recursion7;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        // permutations("abc", "" );

//        ArrayList<String> ans =  permutationsList("abc", "" );
//        System.out.println(ans);

        // System.out.println( permutationsCount("abc", ""));
        System.out.println(permutationsCount2("abc", "", 0));


    }

    static void permutations(String up, String p) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            permutations(up.substring(1), first + ch + second);
        }
    }

    static ArrayList<String> permutationsList(String up, String p) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            ans.addAll(permutationsList(up.substring(1), first + ch + second));
        }
        return ans;

    }

    // taking count inside function body
    static int permutationsCount(String up, String p) {

        if (up.isEmpty()) {
            return 1;
        }

        int count = 0;
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            count = count + permutationsCount(up.substring(1), first + ch + second);
        }
        return count;
    }

    // taking count outside function body

    static int permutationsCount2(String up, String p, int count) {


        if (up.isEmpty()) {
            return count;
        }
        count=0;
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            count = count + permutationsCount2(up.substring(1), first + ch + second,  1);
        }
        return count;
    }
}

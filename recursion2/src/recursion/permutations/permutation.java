package recursion.permutations;

import java.util.ArrayList;

public class permutation {
    public static void main(String[] args) {
        String str = "abc";

        //permut(str,"");

        System.out.println(permutCount(str,""));

        System.out.println(permutList(str,""));
    }

    static void permut(String up, String p){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i); //here we are separating the characters of Processed will put new "ch" in between accordingly
            String s = p.substring(i,p.length());
            permut(up.substring(1), f+ch+s);
        }
    }

    static ArrayList<String> permutList(String up, String p){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
             list.add(p);
            return list ;
        }

        char ch = up.charAt(0);

        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i); //here we are separating the characters of Processed will put new "ch" in between accordingly
            String s = p.substring(i,p.length());
           ans.addAll( permutList(up.substring(1), f+ch+s));
        }
        return ans;
    }

    static int permutCount(String up, String p){

        if(up.isEmpty()){

            return 1;
        }

        int count = 0;

        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i); //here we are separating the characters of Processed will put new "ch" in between accordingly
            String s = p.substring(i,p.length());

           count = count +  permutCount(up.substring(1), f+ch+s);
        }
        return count;
    }
}

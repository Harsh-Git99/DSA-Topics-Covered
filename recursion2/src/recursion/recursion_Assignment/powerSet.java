package recursion.recursion_Assignment;

import java.util.ArrayList;

public class powerSet {
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(set(s,""));

    }

    static ArrayList<String> set (String s, String p){
        if(s.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        char ch = s.charAt(0);
        list.addAll(set(s.substring(1),p));
        list.addAll(set(s.substring(1), ch+p ));


        return list;

    }
}

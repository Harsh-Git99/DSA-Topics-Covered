package recursionRevision.permutations;

import java.util.ArrayList;

public class permutationsOfABC {
    public static void main(String[] args) {
        String s = "abc";
        //permutations(s,"");
        System.out.println(permutationList(s,""));


        System.out.println(permutationsCount(s,""));


    }

    static ArrayList<String> permutationList(String up, String p){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String forward = p.substring(0,i);
            String backward = p.substring(i,p.length());

            list.addAll( permutationList(up.substring(1),forward+ch+backward));
        }
        return list;
    }

    static void permutations(String up, String p){
        if(up.isEmpty()){
            System.out.print(p + " ");
            return;
        }

        for (int i = 0; i <= p.length() ; i++) {
            String forward = p.substring(0,i);
            String backward = p.substring(i,p.length());
            char ch = up.charAt(0);
            permutations(up.substring(1),forward+ch+backward);
        }

    }


    static int  permutationsCount(String up, String p){
        if(up.isEmpty()){
            return 1;
        }
        int count = 0;
        for (int i = 0; i <= p.length() ; i++) {
            String forward = p.substring(0,i);
            String backward = p.substring(i,p.length());
            char ch = up.charAt(0);
          count = count +  permutationsCount(up.substring(1),forward+ch+backward);
        }
        return count;
    }
}

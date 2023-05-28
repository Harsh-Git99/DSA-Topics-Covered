package recursionRevision.combinations;

import java.util.ArrayList;

public class powerSet {
    public static void main(String[] args) {
        String s = "abc";

        //generateSet(s,"");

        System.out.println(generate(s,""));

    }

    static void generateSet(String up, String p){
        if(up.isEmpty()){
            System.out.print (p + " ");
            return;
        }
        char ch = up.charAt(0);
        generateSet(up.substring(1),p+ch);
        generateSet(up.substring(1),p);
    }

    static ArrayList<String> generate(String up, String p){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> takeIt = generate(up.substring(1),p+ch);
        ArrayList<String> leaveIt = generate(up.substring(1),p);

        takeIt.addAll(leaveIt);

        return takeIt;
    }
}

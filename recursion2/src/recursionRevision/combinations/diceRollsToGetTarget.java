package recursionRevision.combinations;

import java.util.ArrayList;

public class diceRollsToGetTarget {
    public static void main(String[] args) {
        int target = 4;
        getAllSums(3,"");
        System.out.println();

        System.out.println(getAll(4,""));
    }

    static void getAllSums(int up, String p){
        if(up == 0){
            System.out.print(p + " ");
            return;
        }
        for (int i = 1; i <= 6 && i <= up; i++) {
            getAllSums(up-i, p+i);
        }
    }

    static ArrayList<String> getAll(int up ,String p){
        if(up == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= 6 && i<=up ; i++) {
            list.addAll(getAll(up-i,p+i));
        }
        return list;
    }
}

package recursion.permutations;

import java.util.ArrayList;

public class NumberOfDiceRollsWithTargetSum {
    public static void main(String[] args) {
        int n = 4;

        //diceRolls(n , "");

        System.out.println(dice(n,"",8));


    }


    static void diceRolls(int n, String p){
        if(n == 0) {
            System.out.println(p);
            return;
        }
            for(int i = 1; i <= 6 && i <= n ; i++) {
                diceRolls(n-i,p+i);
            }
    }

    static ArrayList<String> dice (int n , String p, int face){
        if(n == 0 ){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 1; i <= face && i <= n; i++) {
            ans.addAll(dice(n-i,p+i, face));
        }
        return ans;

    }
}

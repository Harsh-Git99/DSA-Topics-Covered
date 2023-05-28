package Recursion8;

import java.util.ArrayList;

public class DiceRoll {
    public static void main(String[] args) {
       // diceRoll("", 4);
        System.out.println(diceRollList("",4));
    }
    static void diceRoll (String p, int  target){
        if(target == 0){
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= 6 && i <= target; i++) {
         diceRoll(p+i, target-i);
        }
    }
    static ArrayList<String> diceRollList (String p, int  target){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target; i++) {
          list.addAll(diceRollList(p+i, target-i));
        }
    return list;
    }
}

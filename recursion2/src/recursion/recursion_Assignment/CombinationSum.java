package recursion.recursion_Assignment;

import java.util.ArrayList;

public class CombinationSum {
    public static void main(String[] args) {
        int[] arr = {2,3,5};
        int target = 8;
    }

    static ArrayList<ArrayList<Integer>> combinations(int[] arr, int target, ArrayList<Integer> l1){
        if(arr.length == 0){
            ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
            list.add(l1);
            return list;
        }

        int sum = arr[0];
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();

        return list;
    }
}

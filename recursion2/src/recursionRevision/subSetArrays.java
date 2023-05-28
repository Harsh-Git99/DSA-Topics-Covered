package recursionRevision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class subSetArrays {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
      //  System.out.println(returnSubSet(arr));

        System.out.println(returnSubSetRecursive(arr));

    }

    //iterative approach
    static List<List<Integer>> returnSubSet(int[]arr){
        List<List<Integer>> outer = new ArrayList<>();


        outer.add(new ArrayList<>());   //new inner list has been added to outer list of size 1 initially

        for(int ele : arr){
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> list = new ArrayList<>(outer.get(i));
                list.add(ele);
                outer.add(list);
            }
        }
        return outer;
    }


    //recursive approach


    static List<List<Integer>> returnSubSetRecursive(int[] arr) {
        return generateSubsets(arr, arr.length - 1);
    }
    static List<List<Integer>> generateSubsets(int[] arr, int index) {

        if(index < 0){
            List<List<Integer>> outer = new ArrayList<>();
            outer.add(new ArrayList<>());
            return outer;
        }

        List<List<Integer>> outer = generateSubsets(arr, index - 1);
        int ele = arr[index];
        int n = outer.size();

        for (int i = 0; i < n; i++) {
            List<Integer> l1 = new ArrayList<>(outer.get(i));
            l1.add(ele);
            outer.add(l1);

        }

        return outer;



    }

}

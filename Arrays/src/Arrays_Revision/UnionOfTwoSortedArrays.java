package Arrays_Revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class UnionOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 35};
        int[] arr2 = {6 ,9 ,13, 15, 20, 25, 29, 46};

        System.out.println(union(arr1,arr2));
    }

    static ArrayList<Integer> union (int[] a1, int[] a2){

        HashSet<Integer> set = new HashSet<>();

        ArrayList<Integer> list = new ArrayList<>();

        for(int ele : a1){
            set.add(ele);
        }
        for(int ele : a2){
            set.add(ele);
        }


        for(int ele : set){
            list.add(ele);
        }

        Collections.sort(list);

        return list;
    }
}

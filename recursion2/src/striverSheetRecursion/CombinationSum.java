package striverSheetRecursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int[] arr = {2,3,6,7};
        int target = 7;

        System.out.println(combinationSum(arr,target));

    }

    static List<List<Integer>> combinationSum(int[] arr, int target) {

        List<List<Integer>>wrapList = new ArrayList<>();
        List<Integer> list  = new ArrayList<>();
        int sum = 0;
        returnWrapList(arr,wrapList,list,0,target,0);
        return wrapList;

    }

    static void returnWrapList(int[] arr, List<List<Integer>>wrapList, List<Integer> list , int sum, int target, int index){

        if(sum > target)return;
            if (sum == target) {
                wrapList.add(new ArrayList<>(list));

            }
       else{
           for (int i = index; i < arr.length; i++) {
                list.add(arr[i]);
                sum += arr[i];
                returnWrapList(arr,wrapList,list,sum,target, i);
                sum -= arr[i];
                list.remove(list.size()-1);
        }
       }
    }
}

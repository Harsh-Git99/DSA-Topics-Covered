package striverSheetRecursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Combination_Sum2 {
    public static void main(String[] args) {
        int[] arr = {10,1,2,7,6,1,5};
        int target = 8;

        System.out.println(combinationSum2(arr,target));
    }

    static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> wrapList = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        Arrays.sort(candidates);
        combinations(0,candidates,wrapList,list,0,target);
        return wrapList;


    }

    static void combinations(int index, int[] arr ,List<List<Integer>> wrapList,  List<Integer> list, int sum,int target ){
      if(sum > target)return;
       if(sum == target){
           wrapList.add(new ArrayList<>(list));
           return;
       }


        for (int i = index; i < arr.length ; i++) {
            if(i > index && arr[i] == arr[i-1])continue;
            if(arr[i] > target)break;

            list.add(arr[i]);
            sum = sum + arr[i];
            combinations(i+1,arr,wrapList,list,sum,target);
            list.remove(list.size()-1);
            sum-=arr[i];
        }
    }
}

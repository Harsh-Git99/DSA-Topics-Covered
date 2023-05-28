package striverSheetRecursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combi3 {
    public static void main(String[] args) {
        int k = 3;
        int n = 7;

        System.out.println(combinations(k,n));
    }

    static  List<List<Integer>> combinations(int maxQuan , int targetSum) {

        List<Integer> list = new ArrayList<>();
        List<List<Integer>> wrapList = new ArrayList<>();
        int[] arr = {1,2,3,4,5,6,7,8,9};

        getCombinations(0,list,wrapList,0,maxQuan,targetSum,arr);


        return wrapList;

    }

    static void  getCombinations(int sum, List<Integer> list, List<List<Integer>> wrapList,int index,int maxQuan , int targetSum, int[] arr){
        if(list.size() == maxQuan){
            if(sum == targetSum){
                wrapList.add(new ArrayList<>(list));
            }
            return;
        }

        for (int i = index; i < arr.length; i++) {
            list.add(arr[i]);
            sum +=arr[i];
            getCombinations(sum,list,wrapList,i+1,maxQuan,targetSum,arr);
            list.remove(list.size()-1);
            sum-=arr[i];
        }
    }
}

package striverSheetRecursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subSets {
    public static void main(String[] args) {
        int[] arr  = {1,2,3};
        System.out.println(subsets(arr));
    }

    static List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> wrap = new ArrayList<>();

        List<Integer> sunList = new ArrayList<>();

        helper(nums,sunList,wrap,0);

        return wrap;



    }

    static void helper(int[] nums, List<Integer> list, List<List<Integer>> wrap, int index){

        wrap.add(new ArrayList<>(list));

        for (int i = index; i < nums.length; i++) {
            list.add(nums[i]);
            helper(nums,list,wrap,i+1);
            list.remove(list.size()-1);
        }



    }
}


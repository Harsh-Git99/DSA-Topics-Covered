package striverSheetRecursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subsets2 {
    public static void main(String[] args) {
        int [] nums = {1,2,2,2,3,3};

        System.out.println(subsetsWithDup(nums));
    }

    static  List<List<Integer>> subsetsWithDup(int[] nums) {

        List<Integer> list = new ArrayList<>();
        List<List<Integer>> wrapList = new ArrayList<>();
        Arrays.sort(nums);
        getSets(0,nums,list,wrapList);

        return wrapList;

    }

    static void  getSets(int index, int[] nums, List<Integer> list, List<List<Integer>> wrapList){

            wrapList.add(new ArrayList<>(list));



        for (int i = index; i < nums.length; i++) {
            if(i != index && nums[i] == nums[i-1])continue;
            list.add(nums[i]);
            getSets(i+1,nums,list,wrapList);
            list.remove(list.size()-1);
        }
    }
}

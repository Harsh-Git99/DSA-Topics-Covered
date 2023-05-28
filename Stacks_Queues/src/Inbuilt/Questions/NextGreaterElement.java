package Inbuilt.Questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {


        int[] query = {4, 1, 2};
        int[] nums = {1, 3, 4, 2};

        //System.out.println( Arrays.toString(nextGreat(n1,n2)));


        System.out.println(Arrays.toString(nextGreat2(nums, query)));
    }



    //optimized
    static int[] nextGreat2(int[] nums, int[] query) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int[] ans = new int[query.length];
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] < nums[j]) {
                    arr[i] = nums[j];
                    break;
                }
                arr[i] = -1;
            }
        }
        arr[nums.length - 1] = -1;
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], arr[i]);
        }
        for (int i = 0; i < query.length; i++) {
            ans[i] = map.get(query[i]);
        }
        return ans;
    }

    static Integer[] nextGreat(int[] nums, int[] query) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Integer[] ans = new Integer[query.length];
        int[] arr = new int[nums.length];
        for (int i = 0; i <= nums.length - 1; i++) {
            if (i < nums.length - 1 && nums[i] < nums[i + 1]) {
                arr[i] = nums[i + 1];
            } else
                arr[i] = -1;
        }
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], arr[i]);
        }
        for (int i = 0; i < query.length; i++) {
            ans[i] = map.get(query[i]);
        }

        return ans;
    }
}

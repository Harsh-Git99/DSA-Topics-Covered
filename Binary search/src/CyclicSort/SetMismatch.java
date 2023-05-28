package CyclicSort;

import java.util.ArrayList;
import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] nums = {1,1};

        System.out.println(Arrays.toString(setMismatch(nums)));

    }
    static int[] setMismatch(int [] nums){

        int last = nums.length;
        int i = 0;
        while (i < last){
            int correct = nums[i]-1;
            if (nums[i]!=nums[correct]){
                swap(nums, i, correct);
            }
            else
                i++;

        }

        ArrayList<Integer> ans = new ArrayList<>() ;
        for (int index = 0; index < nums.length; index++) {
            if(nums[index]!= index+1){
                return new int[]{nums[index], index+1};
            }
        }
        return new int[]{-1,-1};


    }

    static void swap( int [] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}

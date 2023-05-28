package Arrays.ArraysEasy;

import java.util.Arrays;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};

        System.out.println(isDuplicate2(nums));
    }
    static  boolean isDuplicate(int [] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[i] == arr[j]){
                    return true;
                }
            }
        }
        return false;
    }

    // more optimised
    static  boolean isDuplicate2(int [] arr) {

        Arrays.sort(arr);
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] == arr[i+1]){
                return true;
            }
        }
        return false;
    }

}

package ArraysLecture;

import java.util.Arrays;

public class PassingInFunc {
    public static void main(String[] args) {
        int[] nums = {3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
//  Strings are immutable in JAVA, and Arrays are MUTABLE in java
    }

    static void change (int[] n){
        n[0]=99;
    }
}

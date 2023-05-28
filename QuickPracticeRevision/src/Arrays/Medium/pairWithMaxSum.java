package Arrays.Medium;

import java.util.Arrays;

public class pairWithMaxSum {
    public static void main(String[] args) {
        int[] arr = {4,3,1,5,6};
        System.out.println(maxSum(arr));
    }
    static int maxSum(int[] arr){
        int total = 0;
        for (int i = 1; i < arr.length; i++) {
            total = Math.max(arr[i] + arr[i-1], total);
        }
        return total;
    }



}

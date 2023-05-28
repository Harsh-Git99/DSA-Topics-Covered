package Arrays.Medium;

import java.util.HashMap;
import java.util.HashSet;

public class SubarraySumEquals_K {
    public static void main(String[] args) {
        int[] arr = {28,54,7,-70,22,65,-6};

        System.out.println(noOfSubArrays(arr,100));
    }

//    static int subArray (int[] arr, int k){
//
//    }



    static int noOfSubArrays(int[] arr, int k){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
                int sum =arr[i];
            if (sum == k) {
                count++;
            }
            for (int j = i+1; j < arr.length; j++) {
                sum += arr[j];

                if (sum == k) {
                    count++;
                }else continue;
            }
        }
        return count;
    }


}

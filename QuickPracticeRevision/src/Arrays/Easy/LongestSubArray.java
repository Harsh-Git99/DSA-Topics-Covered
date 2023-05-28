package Arrays.Easy;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class LongestSubArray {
    public static void main(String[] args) {
        int[] arr = {7,1,6,0};
        int k = 7;
        System.out.println(longestSubArray(arr,k));

    }

    static int longestSubArray(int[] arr, int k){

        int sum = 0,count =0,  max = 0, j = 0;
        int i = 0;









        while(i < arr.length){
            sum += arr[i];
            j++;
            if(sum == k){
                count = j;
                if(i< arr.length-1 && (sum+arr[i+1]) == k){
                    count++;
                }
                sum = 0;
                j=0;
            }
            if(count > max){
                max = count;
            }
            i++;

        }
        return max;
    }
}

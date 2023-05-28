package recursionRevision;

import java.util.Arrays;
import java.util.List;

public class findMaxMin {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, -5, -4, 8, 6};

        System.out.println(Arrays.toString(findMinMax(arr)));

    }

    static int[] findMinMax(int[]arr){
        int min = findMin(arr,Integer.MAX_VALUE);
        int max = findMax (arr,Integer.MIN_VALUE);

        int[] ans = new int[2];

        ans[0] = min;
        ans[1] = max;

        return ans;
    }

    static int findMin (int[] arr, int min){
        if(arr.length == 0){

            return min;
        }

        min = Math.min(arr[0],min);
        return findMin(Arrays.copyOfRange(arr,1,arr.length),min);
    }

    static int findMax (int[] arr, int max){
        if(arr.length == 0){

            return max;
        }

        max = Math.max(arr[0],max);
        return findMax(Arrays.copyOfRange(arr,1,arr.length),max);
    }
}

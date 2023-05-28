package BinarySearch.Easy;

import java.util.ArrayList;
import java.util.Arrays;

public class firstLastOccurrence {
    public static void main(String[] args) {
        int[]arr = {1,3,5,5,5,5,7,123,125};
        System.out.println(Arrays.toString(firstLast(arr,7)));

    }

    static int[] firstLast (int[] arr, int k ) {
        int[] ans = new int[2];


        // for first occurrence
        ans[0] = first( arr, k);
        ans[1] = last(arr,k);

        return ans;
    }

    static int first (int[] arr, int k){
        int st = 0;
        int end = arr.length - 1;
        while(st<= end ){
            int mid = st + (end - st )/2;
            if(arr[mid] == k){
                if (mid == 0) return 0;
                else if(mid > 0 && arr[mid-1] != k){
                    return mid;
                }else end = mid -1;
            }else if(arr[mid] > k){
                end  = mid-1;
            }else st = mid+1;
        }
        return -1;
    }

    static int last (int[] arr, int k){
        int st = 0;
        int end = arr.length - 1;
        while(st<= end ){
            int mid = st + (end - st )/2;
            if(arr[mid] == k){
                if (mid == arr.length-1) return arr.length-1;
                else if(mid < arr.length-1 && arr[mid+1] != k){
                    return mid;
                }else st = mid +1;
            }else if(arr[mid] > k){
                end  = mid-1;
            }else st = mid+1;
        }
        return -1;
    }
}

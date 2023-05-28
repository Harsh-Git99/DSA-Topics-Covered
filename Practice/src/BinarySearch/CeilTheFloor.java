package BinarySearch;

import java.security.KeyPair;
import java.util.Arrays;



public class CeilTheFloor {
    public static void main(String[] args) {
        int[] arr = { 5, 6, 8, 9, 6, 5, 5, 6};

        int target = 10;
//
//        System.out.println("Ans is " + ceiling(arr, target));
//        System.out.println("Ans is " + floor(arr, target));

        System.out.println(Arrays.toString(both(arr,target)));


    }

    static int[] both(int[] arr, int target){

        int f = floor(arr,target);
        int c = ceiling(arr,target);


       return new int[] {f,c};
    }

    static int ceiling(int[] arr, int target) {

        Arrays.sort(arr);
        if(target >= arr[arr.length-1]){
            return -1;
        }
        int start = 0;
        int end = arr.length-1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] < target) {
                start = mid + 1;
            } else
                end = mid - 1;
        }
        return arr[start];
    }
    static int floor(int[] arr, int target) {

        Arrays.sort(arr);
        if(target <= arr[0]){
            return -1;
        }
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length-1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] < target) {
                start = mid + 1;
            } else
                end = mid - 1;
        }
        return arr[end];
    }
}

package BinarySearch;

import java.util.Arrays;
public class FirstAndLastElementPositionInArray {
    public static void main(String[] args) {
        int arr[] = {5,7,7,8,8,10};
        int target = 8;

        System.out.println( Arrays.toString(findPosition(arr,target)));
    }

    static int[] findPosition(int[] arr, int target){

      int l =   lastOccurrence(arr,target);
      int f = firstOccurrence(arr,target);

      return new int[]{f,l};
    }

    static  int lastOccurrence(int[]arr, int target){
        int start = 0;
        int end = arr.length-1;
        int lastIndex = -1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(arr[mid] == target){
                lastIndex =mid;
                start =mid+1;
            }
            else if(arr[mid] < target){
                start = mid+1;
            } else if (arr[mid] > target) {
                end=mid-1;
            }
        }
        return lastIndex;
    }

    static  int firstOccurrence(int[]arr, int target){
        int start = 0;
        int end = arr.length-1;
        int firstIndex = -1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(arr[mid] == target){
                firstIndex =mid;
                end =mid-1;
            }
            else if(arr[mid] < target){
                start = mid+1;
            } else if (arr[mid] > target) {
                end=mid-1;
            }
        }
        return firstIndex;
    }

}

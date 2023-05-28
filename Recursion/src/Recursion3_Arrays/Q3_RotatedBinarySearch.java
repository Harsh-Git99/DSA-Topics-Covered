package Recursion3_Arrays;

public class Q3_RotatedBinarySearch {
    public static void main(String[] args) {
        int [] arr = {5,6,7,8,9,1,2,3};
        //getTargetIndex(arr,7,0,arr.length-1);

        System.out.println( getTargetIndex(arr,4,0,arr.length-1));


    }

    static  int getTargetIndex(int[] arr, int target,int start, int end){

        //BreakPoint Statement(if target not found)
        if(start>end){
            return -1;
        }

        int mid = start+(end-start)/2;

        if(target==arr[mid]){
            return mid;
        }

        if(arr[start]<=arr[mid]) {
            if (target >= arr[start] && target <= arr[mid]) {
                // end = mid -1;
                return getTargetIndex(arr, target, start, mid - 1);
            }
//            if (target >= arr[mid] && target <= arr[end]) {
//                // start=mid +1;
//                return getTargetIndex(arr, target, mid + 1, end);
//            }
            //OR
            else
                return getTargetIndex(arr, target, mid + 1, end);
        }
        else
            return getTargetIndex(arr, target,start,mid-1);
    }
}

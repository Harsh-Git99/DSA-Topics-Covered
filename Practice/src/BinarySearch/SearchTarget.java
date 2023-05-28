package BinarySearch;

public class SearchTarget {
    public static void main(String[] args) {
        int [] nums = {-1,0,3,5,9,12};
        int target =9;

        System.out.println(BiSearch(nums,target));
    }

    static int BiSearch(int[] arr, int target){
        int start =0, end = arr.length-1;

        while(start<= end){
            int mid = start +(end-start)/2;

            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]<target){
                start = mid+1;
            }else
                end = mid-1;
        }
        return -1;
    }
}

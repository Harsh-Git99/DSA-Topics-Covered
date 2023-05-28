package BinarySearch;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int [] arr = {1,3,5,7};
        int target = 2;


    }

    //to know the exact
    static int search (int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end-start)/2;

            if(arr[mid] < target){
                start = mid+1;
            } else if (arr[mid] > target) {
                end = mid -1;
            }else if(arr[mid] == target){
                return mid;
            }
        }
        //as the start index has acceded the end index
        if(start>end){
            return start;
        }
        return end;
    }

}

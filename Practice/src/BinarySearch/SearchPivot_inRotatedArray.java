package BinarySearch;

public class SearchPivot_inRotatedArray {
    public static void main(String[] args) {
        int[] arr = {1};
        int target = 0;



        System.out.println(searchPivot(arr));

        System.out.println(searchTarget(arr,target));


    }


    static  int searchTarget(int[] arr, int target) {

        int pivot = searchPivot(arr);


        if (arr[pivot] == -1) {    // if there is no pivot element, then the array is NOT rotated
            //hence, do simple binary search
            return binarySearch(arr, target, 0, arr.length - 1);
        }
        if (arr[pivot] == target) {
            return pivot;
        }
        if (target < arr[0] ) {
            return binarySearch(arr, target, pivot + 1, arr.length-1);
        }
        else
            return binarySearch(arr, target, 0, pivot-1);

    }



    static int binarySearch(int[]arr, int target, int start, int end){
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target == arr[mid]){
                return mid;
            }
            if(target < arr[mid]){
                end = mid-1;
            }else
                start=mid+1;
        }
        return -1;
    }
    static  int searchPivot ( int[] arr){

        int start = 0;
        int end = arr.length - 1;
        int pivotIndex;
        while(start<=end){
            int mid = start+(end-start)/2;
            //search for pivotIndex element

            if(mid < end && arr[mid] > arr[mid+1]){
                pivotIndex = mid;
                return pivotIndex;
            }
            if(mid>start && arr[mid] < arr[mid-1]){
                pivotIndex = mid-1;
                return pivotIndex;
            }
           if (arr[start] >=arr[mid]){
               end = mid-1;
           }
           else
                start = mid+1;      //if the mid was the pivotIndex then it would have been discovered by second if statement.
        }
        return -1;
    }
}

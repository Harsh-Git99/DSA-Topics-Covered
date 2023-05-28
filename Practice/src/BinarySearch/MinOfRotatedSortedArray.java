package BinarySearch;

public class MinOfRotatedSortedArray {
    public static void main(String[] args) {
        int arr[] = {11,12,13,14};
        System.out.println(search(arr));
    }
    static  int search(int []arr){

        int pivot = pivot(arr);

        if(pivot==-1){
            //then the array is not rotated
            // do normal search for min element.
            int min = 5000;
            for (int i = 0; i < arr.length; i++) {
                if(min > arr[i]){
                    min = arr[i];
                }
            }
        return min;
        }
        else
            return arr[pivot];
    }




    static int pivot(int[] arr){
        int start=0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(mid > start && arr[mid] < arr[mid-1]){
                return mid;
            }
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid +1;
            }
            if(arr[start]>= arr[mid]){
                end = mid-1;
            }
            else
                start = mid+1;
        }
        return -1;
    }
}

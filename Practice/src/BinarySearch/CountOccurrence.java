package BinarySearch;

public class CountOccurrence {
    public static void main(String[] args) {
        int [] arr = {0};

        int target = 0;

        System.out.println(countOccurrence(arr,target));
    }

    static int countOccurrence (int[] arr, int target){

        int f = firstOccurrence(arr,target);
        int l = lastOccurrence(arr,target);

        // if an element does not exist in the array, both the functions will give -1
        //i.e. if one function is giving -1, then the target num doesn't exist in the array.
        if(f== -1 || l== -1){
            return 0;
        }

        //if the target element is occurring only once, both the functs
        if(f==0 && l==0){
            return 1;
        }

        //as the index values in array starts from 0 hence we have added 1 here.
        return  l-f+1;
    }

    static int firstOccurrence(int[] arr, int target){
        int start =0;
        int end = arr.length-1;
         int firstIndex = -1;

        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid]==target){
                firstIndex = mid;
                end = mid-1;
            } else if (arr[mid] < target) {
                start = mid+1;
            }else if (arr[mid] > target) {
                end = mid-1;
            }
        }
       return firstIndex;
    }
    static int lastOccurrence(int[] arr, int target){
        int start =0;
        int end = arr.length-1;
        int lastIndex = -1;

        while(start<=end){
            int mid = (start + (end - start)/2);
            if(arr[mid]==target){
                lastIndex = mid;
                start = mid+1;
            } else if (arr[mid] < target) {
                start = mid+1;
            }else if (arr[mid] > target) {
                end = mid-1;
            }
        }
        return lastIndex;
    }
}

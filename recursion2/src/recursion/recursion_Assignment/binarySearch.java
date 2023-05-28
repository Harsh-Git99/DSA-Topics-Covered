package recursion.recursion_Assignment;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {-1,0,3,5,9,12};
        System.out.println(findIndexBS(arr,9,0,arr.length-1));

    }

    static int findIndexBS(int[] arr, int target, int st, int end){
        if(st>=end){
            return -1 ;
        }

        int mid = st + (end - st)/2;
        if(arr[mid]  == target){
            return mid;
        }else if(arr[mid]  > target){
           return findIndexBS(arr, target, st, mid-1);
        }else return findIndexBS(arr, target, mid+1, end);

    }
}

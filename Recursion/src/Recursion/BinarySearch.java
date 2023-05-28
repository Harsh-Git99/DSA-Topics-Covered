package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int [] arr= {1,3,5,7,8,9,11,34,45,57,78,79};
        int target =5;
        int s = 0;
        int e = arr.length-1;
        System.out.println( "The index number of the target element is "+search(arr,target,s,e));
    }
    static int search (int [] arr, int target, int s, int e){

        if(s>e){
            return -1;
        }
        int mid = s+(e-s)/2;

        if(arr[mid] == target){
            return mid;
        }
        if (arr[mid] > target){
            return search(arr,target,s, mid-1);
        }
        if (arr[mid] < target){
            return search(arr,target,mid+1, e);
        }
    return -1;
    }
}

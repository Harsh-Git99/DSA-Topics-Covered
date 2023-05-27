package Arrays_Revision;

import java.util.Arrays;

public class First_Last_positionOfEleOccurance {
    public static void main(String[] args) {
        int [] arr = {};
        int tar = 0;

        System.out.println( Arrays.toString(firstLastPos(arr,tar)));
    }


    static  int[] firstLastPos (int [] arr, int target){

        int first = firstPos(arr,target);
        int last = lastPos(arr,target);

        return new int[] {first,last};
    }

    static  int lastPos (int [] arr, int target){
        int start = 0;
        int end = arr.length-1;

        int last = end;

        while(start <= end){
            int mid = start + (end-start)/2;

            if(arr[mid] == target){
                if(arr[mid] != arr[mid+1]){
                    last = mid;
                    return last;
                }else start = mid + 1;
            }
            else if(arr[mid] >= target){
                end = mid -1;
            }else
                start = mid+1;
        }

        return -1;
    }

    static  int firstPos (int [] arr, int target){
        int start = 0;
        int end = arr.length-1;

        int first = 0;

        while(start <= end){
            int mid = start + (end-start)/2;

            if(arr[mid] == target){
                if(arr[mid] != arr[mid-1]){
                    first = mid;
                    return first;
                }else end = mid - 1;
            }
            else if(arr[mid] >= target){
                end = mid -1;
            }else
                start = mid+1;
        }

        return -1;
    }
}

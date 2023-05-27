package Arrays_Revision;

import java.util.Arrays;

public class PeakElement {
    public static void main(String[] args) {
        int[] arr = {2,3,7,6,3,2,0};
        System.out.println(findPeak(arr));

    }

    static int findPeak(int[] arr){
        int start = 0;
        int end = arr.length-1;

         while(start < end){
            int mid = start + (end - start)/2;

            if(arr[mid] > arr[mid+1]){  //descending part of array
                end = mid;
            }
            else if (arr[mid] < arr[mid+1]){    //ascending part of array
                start = mid +1;
            }
        }
        return end;
    }
}

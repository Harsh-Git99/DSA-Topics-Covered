package recursionRevision;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {24, 18, 38, 43, 14, 40, 1, 54};
        quickSort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }
    static void quickSort(int[] arr, int low, int high){
        if(low>=high){
            return;
        }
        int s = low;
        int e = high;
        int pivot = s+(e-s)/2;

        while(arr[s] < arr[pivot]){
            s++;
        }
        while ((arr[e] > arr[pivot])){
            e--;
        }
        if(s<=e){
            int  temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
        quickSort(arr,low,e);
        quickSort(arr,s,high);
    }
}

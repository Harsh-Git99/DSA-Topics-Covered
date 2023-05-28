package Recursion6;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int [] arr = {9,4,8,6,2,3,5,7,1};
        Quick(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);       //this command uses QuickSort
        System.out.println(Arrays.toString(arr));

    }
    static void Quick (int [] arr, int low, int high){
        if(low >= high){
            return;
        }

        int start = low;
        int end = high;

        int mid = start+(end-start)/2;

        int pivot = arr[mid];

        while (start <= end){

            while(arr[start] < pivot){
                start++;
            }
            while(arr[end] > pivot){
                end--;
            }

            if(start<=end){
                int temp = arr[start];
                arr[start]= arr[end];
                arr[end]=temp;

                start++;
                end--;
            }
        }

        Quick(arr,low,end);
        Quick(arr,start, high);

    }
}

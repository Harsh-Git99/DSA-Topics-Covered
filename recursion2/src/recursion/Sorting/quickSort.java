package recursion.Sorting;

import java.util.Arrays;

public class quickSort {
    public static void main(String[] args) {
        int[] arr = {24 ,18, 38, 43, 14, 40, 1 ,54};

        //quickSort(arr,0,arr.length-1);
        quickSortRepeat(arr,0,arr.length-1);
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
        }while(arr[e] > arr[pivot]){
            e--;
        }
            // at this stage we have values of both s and e which are violating the condition
            // swap the elements at s and e
        if( s <= e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
        quickSort(arr,low , e);
        quickSort(arr,s,high);
    }




    static void quickSortRepeat(int[] arr, int low, int high){
        if(low >= high) return;

        int s = low;
        int e = high;
        int pivot = s+(e-s)/2;


            while(arr[s] < arr[pivot]){
                s++;
            }
            while(arr[e] > arr[pivot]){
                e--;
            }

            if(s<=e){
                //swap
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }


        quickSortRepeat(arr, low, e);
        quickSortRepeat(arr,s,high);
    }










}

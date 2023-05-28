package SortingTechniques.SelectionSort;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {

        int[] arr = {1,3,4,5,2};

        System.out.println(Arrays.toString(sort(arr)));
    }

    static  int [] sort(int[] arr){

        for (int i = 0; i < arr.length-1; i++) {
            int last = arr.length-1-i;
            //search max
            int m = max(arr,0,last);
            // swap
            int temp = arr[m];
            arr[m] = arr[last];
            arr[last]= temp;
        }
        return arr;
    }

    static int max (int[] arr, int start, int last){
        int max = start;
        for (int i = 0; i <=last ; i++) {
            if(arr[max] < arr[i]){
               max = i;
            }
        }
        return max;
    }

}

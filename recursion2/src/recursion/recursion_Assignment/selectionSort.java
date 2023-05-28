package recursion.recursion_Assignment;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {2,1,3,4,7,9,5,0};

       // System.out.println( Arrays.toString(sort(arr)));
        System.out.println(Arrays.toString(recursiveSort(arr,0,0,0)));
    }

    static int[] recursiveSort (int[] arr, int i, int j,int max){
        if(i == arr.length){
            return arr;
        }
        int last = arr.length-1-i;
        if(j > last){
            //swap
            int temp = arr[last];
            arr[last] = arr[max];
            arr[max] = temp;
            return recursiveSort(arr, i+1, 0,0);
        } else if (arr[max] < arr[j]) {
            max = j;
            return recursiveSort(arr, i, j+1,max);
        }else return recursiveSort(arr, i, j+1,max);

    }



    static int[] sort (int[] arr){

        for (int i = 0; i < arr.length; i++) {
            int max = 0;
            //
            int last = arr.length-1-i;
            for (int j = 0; j <= last; j++) {
                if(arr[max] < arr[j]){
                    max = j;
                }
            }
            // swap with the last index

            int temp = arr[last];
            arr[last] = arr[max];
            arr[max] = temp;

        }

        return arr;
    }
}

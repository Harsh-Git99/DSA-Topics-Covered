package Recursion4;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {3,1,5,4,2};

//       BubbleSort(arr, arr.length-1,0);
//        System.out.println(Arrays.toString(arr));

        int i = arr.length-1;
        int j = 0;

        Bubble(arr, i, j);
        System.out.println(Arrays.toString(arr));
    }


    static void Bubble( int [] arr, int i, int j) {

        if (i == 0) {
            return;
        }
        if (i > j) {
            if (arr[j] > arr[j + 1]) {
                //swap
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
            Bubble(arr, i , j + 1);
        }
        else
             Bubble(arr, i - 1, 0);
    }

    static void BubbleSort (int [] arr , int i, int j){
        if(i == 0) {
            return  ;
        }
        if( i > j ) {
            if (arr[j] < arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;

            }
            BubbleSort(arr, i,j + 1);
        }
            else
               BubbleSort(arr, i-1,0);
    }
}

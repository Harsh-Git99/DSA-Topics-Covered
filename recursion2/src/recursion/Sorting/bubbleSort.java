package recursion.Sorting;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        //bubble(arr);
       // System.out.println(Arrays.toString(arr));

        bubbleRecursive(arr,0,1);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleRecursive(int[] arr , int i, int j){
        if(i == arr.length){
            return;
        }
        if(arr[j] < arr[j-1]){
            //swap
            int temp = arr[j];
            arr[j] = arr[j-1];
            arr[j-1] = temp;
        }
        if(j >= (arr.length-1)-i){
            bubbleRecursive(arr, i+1,1);
        }else bubbleRecursive(arr, i, j+1);
    }

    //iterative approach
    static void bubble(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1 ; j <= (arr.length-1)-i ; j++) {
                if(arr[j] < arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}

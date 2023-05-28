package recursion.recursion_Assignment;

import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {3,6,7,8,2,1,5};

        System.out.println(Arrays.toString(recursiveSort(arr,0,1)));

        //System.out.println( Arrays.toString(sort(arr)));

    }

    //recursive approach
    static int[] recursiveSort(int[] arr, int i, int j){
        if(i == arr.length-1){
            return arr;
        }
        if(j == 0){
           return recursiveSort(arr,i+1,(i+1)+1);
        }


        else if(arr[j] < arr[j-1]) {
            //swap
            int temp = arr[j];
            arr[j] = arr[j - 1];
            arr[j - 1] = temp;
            return recursiveSort(arr, i, j-1);
        } else return recursiveSort(arr, i, j-1);

    }


    //iterative approach
    static int[] sort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j > 0; j--) {
                if(arr[j] < arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        return arr;
    }
}

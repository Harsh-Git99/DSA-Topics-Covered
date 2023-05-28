package recursion.Sorting;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
//        sorting(arr);
//        System.out.println(Arrays.toString(arr));;

        sortingRecursively(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));;
    }

    // recursive approach
    static void sortingRecursively(int[] arr, int i, int j, int max){
        if(i == 0) return;
        if(j < i) {
            if (arr[max] < arr[j]) {
                sortingRecursively(arr, i, j + 1, j);
            } else sortingRecursively(arr, i, j + 1, max);
        }else {

                int temp = arr[max];
                arr[max] = arr[i-1];
                arr[i-1] = temp;
                sortingRecursively(arr,i-1, 0 ,0 );

        }
    }








    //iterative approach
    static void sorting (int[] arr){
        int max = 0;

        //finding max index
        for (int i = 0; i < arr.length-1; i++) {
            int last = arr.length-1-i;

            for (int j = 0; j <= last; j++) {
                if (arr[max] < arr[j]) {
                    max = j;
                }
            }
            //swap max with last element;
            int temp = arr[max];
            arr[max] = arr[last];
            arr[last] = temp;
        }

    }
}

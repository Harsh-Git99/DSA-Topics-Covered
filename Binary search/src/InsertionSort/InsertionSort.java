package InsertionSort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int [] arr = {0,-23,56,18};

        InsertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void InsertionSort(int [] arr){

        int last = arr.length-2;
        for (int i = 0; i <= last ; i++) {
            for (int j = i+1; j > 0  ; j--) {
                if(arr[j]<arr[j-1]){
                    swap(arr, j, j-1);
                }else       // when element j is not smaller than (j-1), break the loop
                // as this lhs array is already sorted
                    break;
            }
        }

    }

    static void swap(int [] arr, int first, int last ){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last]= temp;
    }
}

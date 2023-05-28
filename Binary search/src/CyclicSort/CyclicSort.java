package CyclicSort;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int [] arr = {5,4,3,2,1};

        CyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
// when given numbers are from range 0 to N, then use CYCLIC SORT
    static void CyclicSort(int[] arr){
        int last = arr.length-1;
        int i =0;
        while (i != last) {
            int correct = arr[i]-1;
            if(arr[i] != arr[correct]){
                    swap(arr, i, correct);

            }else
                i++;
        }

    }

    static void swap(int [] arr, int first, int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last]= temp;
    }
}

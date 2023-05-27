package ArraysLecture;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = { 1,3,4,6,2,4,67,4,32};
        System.out.println("original");
        System.out.println(Arrays.toString(arr));
        swap(arr,1,3);
        System.out.println("Swapped");
        System.out.println(Arrays.toString(arr));

        reverse(arr);
        System.out.println("Reversed array is " + Arrays.toString(arr));

    }

    static  void swap (int arr[], int index1, int index2){
        int temp = arr[index1];
        arr [index1] = arr[index2];
        arr [index2] = temp;
    }

    static  void  reverse (int[] arr){
       // int new_arr = arr[0];
        int start = 0;
        int end = arr.length-1;

        while (start < end) {
            swap(arr, start,end);
            start++;
            end--;
        }
    }
}

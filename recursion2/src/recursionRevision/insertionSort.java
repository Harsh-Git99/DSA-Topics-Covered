package recursionRevision;

import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void insertionSort(int[] arr){
        for (int i = 0; i <= arr.length-2; i++) {
            for (int j = i+1; j > 0; j--) {
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

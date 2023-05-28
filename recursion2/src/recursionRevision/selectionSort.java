package recursionRevision;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 9, 7};
        selectionRec(arr,0);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionRec(int[] arr, int i ){
        if(i == arr.length){
            return;
        }
        int maxI = maxElement(arr,arr.length-i);
        //swap
        int temp = arr[arr.length-1-i];
        arr[arr.length-1-i] = arr[maxI];
        arr[maxI] = temp;

        selectionRec(arr,i+1);
    }

    static void selectionSort(int[]arr){

        for (int i = 0; i < arr.length; i++) {
                int maxI = maxElement(arr, arr.length-i);
                //swap
                int temp = arr[arr.length-1-i];
                arr[arr.length-1-i] = arr[maxI];
                arr[maxI] = temp;
        }

    }

    static int maxElement(int[]arr, int n){
        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < n; i++) {
           if(max < arr[i]){
               max = arr[i];
               index = i;
           }
        }
        return index;
    }

}

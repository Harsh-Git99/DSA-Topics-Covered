package recursionRevision;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {3,6,4,2,4,7,8,2,3,7,4,7,2,5,6,3,9,7};
//        bubbleSort(arr);
//        System.out.println(Arrays.toString(arr));
        bubbleRec(arr,0,1);
        System.out.println(Arrays.toString(arr));
    }


    static void bubbleRec(int[] arr, int i , int j){
        if(i == arr.length){
            return;
        }
        if(j < arr.length-i){
            if(arr[j] < arr[j-1]){
                //swap
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
            }
            bubbleRec(arr,i,j+1);
        }else if(j >= arr.length-i) {
            bubbleRec(arr, i + 1, 1);
        }
    }

    static void bubbleSort(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j] < arr[j-1]){
                    //swap
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }


}

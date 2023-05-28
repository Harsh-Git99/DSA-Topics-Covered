package recursion.recursion_Assignment;

import java.lang.reflect.Array;
import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {3,8,4,2,5,1};

        //System.out.println(Arrays.toString(bubble(arr)));

        System.out.println(Arrays.toString(recursiveBubble(arr,0,1)));
    }

    static int[] recursiveBubble(int[] arr, int i, int j){
        if(i == arr.length){
            return arr;
        }
        if(j == arr.length-i){
          return   recursiveBubble(arr, i+1,1);
        }
        else if(arr[j] < arr[j-1]){
            //swap
            int temp = arr[j];
            arr[j] = arr[j-1];
            arr[j-1] = temp;
          return   recursiveBubble(arr, i,j+1);
        } else return recursiveBubble(arr, i,j+1);
    }

    //iterative approach
    static int[] bubble(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1  ; j < arr.length-i ; j++) {
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

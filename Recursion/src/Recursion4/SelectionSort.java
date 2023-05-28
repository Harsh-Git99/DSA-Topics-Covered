package Recursion4;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        int [] arr = {4,3,2,1,5};
        selection(arr, arr.length,0, 0);
        System.out.println(Arrays.toString(arr));


    }

    static void selection(int [] arr, int Pass, int elementIndex, int maxElementIndex){
        // we are starting pass from pass = arr.length

        if(Pass == 0){
            return;
        }
        if(Pass > elementIndex){
            if(arr[elementIndex] > arr[maxElementIndex]){

                selection(arr, Pass, elementIndex+1, elementIndex );
                // because num at elementIndex > num at maxElementIndex
                // maxElementIndex is now equal to new MAX num's index, i.e. elementIndex.
            }
            else {
                selection(arr, Pass, elementIndex+1, maxElementIndex );
                // bcuz, num at elementIndex < num at maxElementIndex
                // max element remains the same number
            }
        }else {
            // swap the max element with the element at the last index of the array
            // and decrease the Pass value by 1 (as the value at last index is fixed now
            int temp = arr[maxElementIndex];
            arr[maxElementIndex] = arr[Pass-1];
            arr[Pass-1] = temp;
            selection(arr, Pass-1, 0,0);
        }
    }
}




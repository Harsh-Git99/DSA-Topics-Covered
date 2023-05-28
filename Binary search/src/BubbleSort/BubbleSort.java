package BubbleSort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {3,1,5,4,2};
        Bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    static void Bubble(int[] arr){
        boolean swapped;
        // run the steps arr.length-1 times

        for (int i = 0; i < arr.length; i++) {
            
            //initial value of Swapped is taken false.
            swapped=false;
            //for each step, max item will come at the last respective index
            for (int j = 1; j < arr.length-i ; j++) {
                //swap if the item is smaller than the previous item
                if(arr[j] < arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j]= arr[j-1];
                    arr[j-1] = temp;
                    swapped=true;
                }

            }
            // if the items are not swapped for a particular value of i,
            // therefore stop the program
            if(swapped == false){
                break;
            }
        }
    }

//    static int[] swap (int a, int b){
//        int temp = a;
//        a=b;
//        b=temp;
//        return new int[]{a,b};
//    }
}

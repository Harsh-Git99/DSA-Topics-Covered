package Arrays.Medium;

import java.util.ArrayList;
import java.util.Arrays;

public class nextPermutation {
    public static void main(String[] args) {
        int[] arr = {1,3,2};
        //System.out.println(Arrays.toString(nextPermutation(arr)));
        nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void nextPermutation(int[] arr){

        //start the loop from N

        for (int i = arr.length-2; i >=0 ; i--) {
            if(  arr[i] < arr[i+1]){

               // find the smallest  on rhs of i-1
                int s = findSmallestNumIndex(arr,i);
                //swap
                int temp = arr[s];
                arr[s] = arr[i];
                arr[i] = temp;

                //reverse from i till end.
                reverse(arr,i+1);
                break;
            }else if(i == 1 && arr[i-1] >= arr[i] ){
                reverse(arr,0);
                break;
            }
        }
        System.out.println();

    }

    static int findSmallestNumIndex (int[] arr, int st){
        int i = st;

        int j = arr.length-1;

        while( arr[j] <= arr[i]){
            j--;
        }

        return j ;
    }

    static int[] reverse (int[]arr , int st ){
        int i = st, j = arr.length-1;

        while(i<j){
            //swap
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }



}

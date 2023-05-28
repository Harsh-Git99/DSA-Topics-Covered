package BinarySearch.medium;

import java.util.Arrays;

public class MinimumNumberDaysMakemBouquets {
    public static void main(String[] args) {

    }
    //DOUBT

    static  int minDays(int[] arr, int m, int k){
        if(m*k >= arr.length){
            return -1;
        }
        Arrays.sort(arr);
        int st = arr[0];
        int end = arr[arr.length-1];

        while(st<=end){
            int mid = st + (end - st)/2;
            if(canMakeMBouq(arr,m,mid));
        }
        return -1;
    }

     static boolean canMakeMBouq(int[] arr, int m, int k) {
         for (int i = 0; i < arr.length; i++) {
             if(k >= arr[i]){
                 int days = arr[i]/k;
             }

         }
    return true;
    }
}

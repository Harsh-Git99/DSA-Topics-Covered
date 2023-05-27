package Arrays_Revision;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;

        rotated(arr,k);

        System.out.println(Arrays.toString(arr));

    }

    static  void  rotated (int[] arr, int k){
        k = k % arr.length;

        if(k < 0){
            k = k + arr.length;
        }

        int li = 0;
        int ri = arr.length-k-1;

        while(li<ri){
            int temp = arr[li];
            arr[li] = arr[ri];
            arr[ri] = temp;

            li++;
            ri--;
        }

        int lj = arr.length-k;
        int rj = arr.length-1;

        while(lj < rj){
            int temp = arr[lj];
            arr[lj] = arr[rj];
            arr[rj] = temp;

            lj++;
            rj--;
        }


        int i = 0;
        int j = arr.length-1;

        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j]=temp;

            i++;
            j--;
        }
    }

}

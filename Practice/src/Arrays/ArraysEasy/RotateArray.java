package Arrays.ArraysEasy;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int arr[] = {-1,-100,3,99};
     //   System.out.println(Arrays.toString(rotateLeftBy1Place(arr)));
        System.out.println(Arrays.toString(arr));
          System.out.println(Arrays.toString(rotateRightNplace(arr,2)));

    }

    static int[] rotateLeftBy1Place(int[] arr){
        int[] temp = new int[arr.length];
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            temp[j] = arr[i];
            j++;
        }
        temp[j]= arr[0];
        return temp;
    }

    static  int[] rotateRightNplace(int[] arr, int k){
        k = k% arr.length;
        if(k<0){
            k=k+ arr.length;
        }
        int li = 0;
        int ri = arr.length-k-1;
        //rotating array before index k
        while (li<ri){
            int temp = arr[li];
            arr[li] = arr[ri];
            arr[ri]=temp;

            li++;
            ri--;
        }
        //rotating array after index k
        int lj = arr.length-k;
        int rj = arr.length-1;

        while (lj<rj){
            int temp = arr[lj];
            arr[lj] = arr[rj];
            arr[rj]=temp;

            lj++;
            rj--;
        }

        //rotating whole array
        int i =0;
        int j = arr.length-1;

        while (i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j]=temp;

            i++;
            j--;
        }
        return arr;
    }


}

package Recursion5;

import java.util.ArrayList;
import java.util.Arrays;

public class mergeSort_recursion {
    public static void main(String[] args) {
        int [] arr= {5,5,4,3,2,1,1};

        //MergeSort(arr);
        System.out.println(Arrays.toString(MergeSort2(arr)));
    }

    static  int [] MergeSort2(int[] arr){

        if(arr.length == 1){
            return arr;
        }

        int mid= arr.length/2;

        int [] left = MergeSort2(Arrays.copyOfRange(arr, 0, mid));
        int [] right = MergeSort2(Arrays.copyOfRange(arr,  mid, arr.length));

        return merge2(left,right);

    }

    private static int[] merge2(int[] first, int[] second) {

        int i =0 , j = 0, k=0;

        int[] mix = new int[first.length+ second.length];

        while(i < first.length && j < second.length){
            if(first[i] < second[j]){
                mix[k]= first[i];
                i++;
                k++;

            }else {
                mix[k] = second[j];
                j++;
                k++;

            }

        }

        while(i<first.length){
            mix[k] = first[i];
            i++;
            k++;
        }
        while(j<second.length){
            mix[k] = second[j];
            j++;
            k++;
        }

        return mix;


    }

// practice
    static int[] MergeSort(int []arr){
        if(arr.length==1){
            return arr;
        }

        int mid = arr.length/2;

        int[] left = MergeSort(Arrays.copyOfRange(arr, 0, mid )) ;

        int[] right=MergeSort(Arrays.copyOfRange(arr, mid, arr.length)) ;

        return Merge(left, right);


    }

    private static int[] Merge(int[] first  , int[] second) {
        int[] mix = new int[first.length + second.length];

        int i =0 ,j = 0,k = 0;
        while(i < first.length && j < second.length){
            if(first[i] < second[j]){
                mix[k] = first[i];
                i++;
            }else {
                mix[k] = second[j];
                j++;
            }
            k++;

        }

        //in case if one of the arrays is not completed (i.e. first.length > second.length or vice versa)
        // copy the remaining elements from the larger array.
        while (i< first.length){
            mix[k] = first[i];
            i++;
            k++;
        }
        while (j < second.length){
            mix[k] = second[j];
            j++;
            k++;
        }

        return mix;
    }
}

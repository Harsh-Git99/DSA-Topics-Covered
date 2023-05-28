package recursionRevision;

import java.util.Arrays;

public class mergeSortInPlace {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};

        merge(arr,0,arr.length-1);

        System.out.println(Arrays.toString(arr));

    }


    static void merge(int[] arr, int  s, int e){

        if(s==e){
            return ;
        }
        int mid = (s+e)/2;

         merge(arr,s,mid);
         merge(arr,mid+1, e);

         mergeSort(arr,s,mid,e);

    }

    static void mergeSort(int[] arr, int s, int mid , int e){
        int[] mix = new int[e-s+1];

        int i = s;
        int j = mid+1 ;
        int k = 0;

        while (i <= mid && j <= e){
            if(arr[i] <= arr[j]){
                mix[k] = arr[i];
                i++;
                k++;
            }else if(arr[i] > arr[j]){
                mix[k] = arr[j];
                j++;
                k++;
            }
        }

        while (i <= mid){

                mix[k] = arr[i];
                i++;
                k++;

        }
        while (j <= e){

            mix[k] = arr[j];
            j++;
            k++;

        }
        System.out.println(Arrays.toString(mix));
        for (int l = 0; l < mix.length; l++) {
            arr[s+l] = mix[l];      //here we are putting back the elements at index s + l(as till s the array is already updated)
        }
    }
}

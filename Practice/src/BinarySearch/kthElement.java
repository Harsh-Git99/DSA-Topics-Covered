package BinarySearch;

import java.util.Arrays;

public class kthElement {
    public static void main(String[] args) {

        int [] arr1 = {2, 3, 6, 7, 9};
        int []arr2 = {1, 4, 8, 10};
        int k = 5;

        System.out.println( kthElement(arr1,arr2,k));
    }
    static long kthElement( int arr1[], int arr2[], int k) {
        int[] arr = new int[arr1.length+ arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            if(i<arr1.length) {
                arr[i] = arr1[i];
            }
        }
        int j = 0;
        for (int i = arr1.length; i < arr.length; i++) {
            if(i<arr.length) {
                arr[i] = arr2[j];
                j++;
            }
        }
       //sort
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        return arr[k-1];
    }
}

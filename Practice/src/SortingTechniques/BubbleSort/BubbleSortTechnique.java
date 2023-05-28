package SortingTechniques.BubbleSort;

import java.util.Arrays;

public class BubbleSortTechnique {
    public static void main(String[] args) {
        int[]arr = {3,1,4,5,2};
        System.out.println(Arrays.toString(sort(arr)));
    }

    static int [] sort (int[] arr) {
        // counter i is only running till the 2nd index of the array is not sorted
        // because the 1st index will automatically be at the right place,
        // if all the other elements after 1st index are sorted
        for (int i = 0; i < arr.length - 1; i++) {

            // j is the pointer to the elements which is comparing and swaping them accordingly
            // here after every pass, the greatest element from the unsorted array will be shifted to the right position
            // so, with every pass we can decrease the length of the array which is supposed to be sorted by 1.
            for (int j = 1; j <= arr.length - 1 - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        return arr;
    }

}

package Arrays.ArraysEasy;

import java.util.Arrays;

public class LargestNum {
    public static void main(String[] args) {
        int ArrSize = 5;
        int[] arr = { 5, 4, 3, 2, 1 };

        // System.out.println(LargestofNum(arr, ArrSize));

        // System.out.println(Arrays.toString(arr));

        System.out.println(largest(arr, ArrSize));
        System.out.println(Arrays.toString(arr));
    }

    // brute force method(less optimum)
    static int LargestofNum(int[] arr, int n) {

        for (int i = 0; i <= n - 1; i++) {

            for (int j = 1; j <= n - 1; j++) {
                if (arr[j] < arr[j - 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }

        }
        return arr[n - 1];
    }

    // more optimized
    static int largest(int[] arr, int n) {
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}

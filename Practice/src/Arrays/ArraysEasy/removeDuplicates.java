package Arrays.ArraysEasy;

import java.util.Arrays;

public class removeDuplicates {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 5, 6, 12, 13, 17, 19, 22, 23, 25, 27, 28, 28, 35, 36, 37, 39, 43, 46, 48, 54, 59, 62, 63,
                65, 68, 68, 70, 70, 72, 79, 82, 83, 92, 92, 93, 95, 96, 96, 100 };
        // int[] arr1 = {2,2,2,2,2 };
        // System.out.println((remove(arr)));

        System.out.println(remove_duplicate(arr));

    }

    static int remove(int[] arr) {
        int[] temp = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j] = arr[i];
                j++;
            }
        }
        temp[j] = arr[arr.length - 1];
        return j + 1;
    }

    static int remove_duplicate(int a[]) {
        int idx = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[idx] != a[i]) {
                idx++;
                a[idx] = a[i];
            }
        }

        return idx + 1;
    }
}

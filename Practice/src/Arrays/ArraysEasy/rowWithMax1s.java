package Arrays.ArraysEasy;

import java.util.ArrayList;

public class rowWithMax1s {
    public static void main(String[] args) {
        int[][] arr = { { 0, 1, 1, 1 }, { 0, 0, 1, 1 }, { 1, 1, 1, 1 }, { 0, 0, 0, 0 } };

        int[][] arr2 = { { 0, 0, 0, 0 } };

        System.out.println(maxOnes(arr));

        // more optimized way with no auxilary Space complexity
        System.out.println("Index number is " + rowWithMax1(arr));
    }

    static int maxOnes(int[][] arr) {

        int count = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                if (arr[row][col] == 1) {
                    count++;
                }

            }
            list.add(count);
            count = 0;
        }
        System.out.println(list);

        int maximum = 0;
        int i;
        for (i = 0; i < list.size(); i++) {
            if (maximum < list.get(i)) {
                maximum = list.get(i);
            }
        }
        if (maximum == 0) {
            return -1;
        }

        return list.indexOf(maximum);
    }

    // more optimized way with no auxilary Space complexity

    static int rowWithMax1(int arr[][]) {

        int maxCount = 0;
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            int rowCount = 0;
            int j = 0;
            while (j < arr[0].length) {
                if (arr[i][j] == 1)
                    rowCount += 1;
                j++;
            }
            if (maxCount < rowCount) {
                maxCount = rowCount;
                index = i;
            }

        }

        return index;
    }
}

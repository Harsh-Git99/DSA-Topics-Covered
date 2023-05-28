package BinarySearch2DArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Median_in_rowwise_sorted_Matrix {
    public static void main(String[] args) {

        int[][] arr = {{1, 3, 5},
                {2, 6, 9},
                {3, 6, 9}};
        System.out.println(median(arr));
    }

    static int median (int[][] arr){
        int rows = arr.length;
        int cols = arr[0].length;
        ArrayList<Integer> list = new ArrayList<>(rows+cols);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                list.add(arr[i][j]);
            }
        }
        System.out.println(list);
        Collections.sort(list);
        int median = (list.size()+1)/2;


        System.out.println(list);
        return list.get(median-1);
    }
}

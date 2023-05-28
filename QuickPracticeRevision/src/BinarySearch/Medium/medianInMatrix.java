package BinarySearch.Medium;

import java.util.ArrayList;
import java.util.Arrays;

public class medianInMatrix {
    public static void main(String[] args) {
        int[][] mat = {
                {1,3,5},
                {2,6,9},
                {3,6,9}
        };

        sortForMedian(mat);
        for(int[] arr : mat){
            System.out.println(Arrays.toString(arr));
        }

    }

    static void sortForMedian(int[][] mat){

        int cols = mat[0].length-1;
        for (int row = 1; row < mat.length; row++) {
            int sCol = 0;
            int eCol = mat[0].length-1;
            while (sCol <= eCol){
                int mid = sCol + (eCol-sCol)/2;
                if(row > 0 &&  mat[row][mid] < mat[row-1][cols] ){

                    int temp  = mat[row][mid];
                    mat[row][mid] = mat[row-1][cols];
                    mat[row-1][cols] = temp;
                    while( cols > 0 && mat[row-1][cols] < mat[row-1][cols-1]){
                        //swap
                        int temp1  = mat[row-1][cols];
                        mat[row-1][cols] = mat[row-1][cols-1];
                        mat[row-1][cols-1] = temp;
                        cols--;
                    }
                }else eCol = mid-1;
            }
        }
    }
}

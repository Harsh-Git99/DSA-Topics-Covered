package Arrays.ArraysMedium;

import java.util.ArrayList;
import java.util.Arrays;

public class SetMatrixZeroes {
    public static void main(String[] args) {
       int[][] matrix = {{1,1,1}, {1,0,1}, {1,1,1} };

        setZeroes2(matrix);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    //Using mat[i][0] and mat[0][j] as dummy arrays
    static void setZeroes2(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int col0 = 1;

        for (int i = 0; i < rows; i++) {
            if(matrix[i][0] == 0) col0 =0;
            for (int j = 0; j < cols; j++) {
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j] = 0;
                }
            }
        }

        for (int i = rows-1; i >= 0 ; i--) {
            for (int j = cols-1; j >=1 ; j--) {
                if(matrix[i][0] == 0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
            if(col0==0){
                matrix[i][0] = 0;
            }
        }
    }




    // using two dummy arrays
    static void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        int[] dummy1 = new int[row];
        int[] dummy2 = new int[col];
        Arrays.fill(dummy1,-1);
        Arrays.fill(dummy2,-1);

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(matrix[i][j] == 0){
                    dummy1[i] = 0;
                    dummy2[j] = 0;
                }
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(dummy1[i] == 0 || dummy2[j] ==0){
                    matrix[i][j]=0;
                }
            }
        }

    }
}

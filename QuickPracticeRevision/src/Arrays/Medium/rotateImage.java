package Arrays.Medium;

import java.util.ArrayList;
import java.util.Arrays;

public class rotateImage {
    public static void main(String[] args) {
        int[][] arr = {
                {5,1,9,11},
                {2,4,8,10},
                {13,3,6,7},
                {15,14,12,16}
        };
        rotateInPlace(arr);

        for (int[] a : arr ){
            System.out.println(Arrays.toString(a));
        }



//        for (int[] a : rotateNotInPlace(arr) ){
//            System.out.println(Arrays.toString(a));
//        }
    }
    static int[][] rotateNotInPlace(int[][] mat){

        int[][] ans = new int[mat.length][mat[0].length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                ans[j][(mat.length-1)-i] = mat[i][j];
            }
        }
        return ans;
    }


    static void rotateInPlace(int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = i; j < cols; j++) {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        int st = 0;
        int end = cols-1;

        while(st < end){
            for (int i = 0; i < rows; i++) {
                int temp = matrix[i][st];
                matrix[i][st] = matrix [i][end];
                matrix[i][end] = temp;
            }
            st++;
            end--;
        }
    }
}

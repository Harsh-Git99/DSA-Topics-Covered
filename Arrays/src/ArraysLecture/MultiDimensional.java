package ArraysLecture;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensional {
    public static void main(String[] args) {
        //1D array is defined by one [] and 2D array is defined by two [][]
        Scanner in = new Scanner(System.in);
      //  int[][] arr = new int[3][4];     //No. of Rows is mandatory to specify and No. of Column isn't mandatory to specify.
        //System.out.println(arr.length);     // will only give us the value of row i.e. 3
        //OR

        int[][] arr2D = {
                {1,2,3},
                {4,5,6},
                {7,8,9}       // no need to specify the column
        };

        //INPUT

        for (int row = 0; row < arr2D.length; row++) {
            for (int col =0; col < arr2D[row].length; col++){
                arr2D[row][col]= in.nextInt();
            }
        }

        //output
        for (int row =0; row < arr2D.length; row++){
            for (int col = 0; col < arr2D[row].length ; col++) {
                System.out.print( arr2D[row][col] + " ");
            }
            System.out.println();
        }
        for (int row =0; row < arr2D.length; row++) {
            System.out.println(Arrays.toString(arr2D[row]));
        }

    }
}

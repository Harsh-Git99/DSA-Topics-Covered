package LinearSearch;

import java.util.Arrays;

public class SearchIn2D {
    public static void main(String[] args) {
        int[][] arr2d = {
                {44,34,57},
                {34,33,54,},
                {78,66,8},
        };
        int target = 66;
        search2d(arr2d ,target);

        MaxSearch2d(arr2d);

        MinSearch2d(arr2d);

    }

    static void search2d(int [][] arr,int trgt){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length ; col++) {

                if (arr[row][col] == trgt){
                    System.out.println("The target is found "+arr[row][col]);
                    System.out.println("The target coordinates are " + Arrays.toString(new int[]{row, col}));
                }

            }       // in case we need to return the array row and col,
                    // we need to write like : ***return new int[] {row,col};***

        }
    }
    static void MaxSearch2d(int [][] arr){
        int max = arr[0][0];
        int row, col = 0 ;
        for ( row = 0; row < arr.length; row++) {
            for ( col = 0; col < arr[row].length ; col++) {

                if (arr[row][col] > max){
                    max = arr[row][col];
                }
            }
        }
        System.out.println("The Min number in the 2D array is "+ max);

    }
    static void MinSearch2d(int [][] arr){
        int min = arr[0][0];
        int row, col = 0 ;
        for ( row = 0; row < arr.length; row++) {
            for ( col = 0; col < arr[row].length ; col++) {

                if (arr[row][col] < min){
                    min = arr[row][col];
                }
            }
        }
        System.out.println("The Max number in the 2D array is "+ min);

    }
}

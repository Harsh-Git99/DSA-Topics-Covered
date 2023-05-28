package Arrays.ArraysEasy;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {{1}};
        int target=2;

        System.out.println(linearSearch(arr, target));

        // optimum way of solving when matrix is sorted in row-wise and col-wise manner
        System.out.println(Arrays.toString(search(arr,target)));
    }

    static int linearSearch(int[][]arr, int target){

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target){
                    return target;
                }
            }
        }
        return -1;
    }

    static int[] search(int[][] arr, int target){

        int r = 0;
        int c = arr[r].length-1;
        while(r < arr.length && c >= 0){
            if(arr[r][c]==target){
                return new int[]{r,c};
            }
            if(arr[r][c] < target){
                r++;
            }
            else{
                c--;
            }
        }
        return  new int[]{-1,-1};
    }
}

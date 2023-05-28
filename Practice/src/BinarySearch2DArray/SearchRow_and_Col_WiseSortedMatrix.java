package BinarySearch2DArray;
import java.util.Arrays;
public class SearchRow_and_Col_WiseSortedMatrix {
    public static void main(String[] args) {
        int[][] arr={
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,60}
        };
        int target = 30;

        System.out.println(Arrays.toString(search(arr,target)));
    }

    static int[] search (int[][] arr, int target){
        int row =0;
        int col = arr[row].length-1;
        while(row<arr.length && col>=0){
            if(arr[row][col]==target){
                return new int[]{row,col};
            }
            if(arr[row][col]>target){
                col--;
            }else
                row++;
        }
        return new int[] {-1,-1};
    }
}

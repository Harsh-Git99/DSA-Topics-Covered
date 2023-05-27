package Arrays_Revision;

import java.util.Arrays;

public class rowColWiseSortedMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        int target = 37;

        System.out.println(Arrays.toString(findTargetIndex(matrix,target)));
    }

    static  int[] findTargetIndex (int[][] mat, int target){
        int row = 0;
        int col = mat.length-1;

        while(row< mat.length && col >= 0){

            if(mat[row][col] == target){
                return new int[] {row,col};
            } else if (mat[row][col] > target) {
                col--;
            }else row++;
        }
        return new int[]{-1,-1};
    }
}

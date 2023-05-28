package BinarySrc;

import java.util.Arrays;

public class SortedMatrix  {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3,4},
                {5, 6, 7,8},
                {9, 10, 11,12},
                {13,14,15,16}

        };

        int target = 16;

        System.out.println( Arrays.toString(searchMatrix(matrix,target)));

    }
    //Search in the provided row between the cols provided.
        static int[] BinarySearch (int[][] matrix, int row, int ColStart, int ColEnd, int target ) {

            while (ColStart <= ColEnd) {
                int mid = ColStart + (ColEnd - ColStart) / 2;

                if (matrix[row][mid] == target) {
                    return new int[]{row, mid};
                }
                if (matrix[row][mid] < target) {
                    ColStart = mid + 1;
                } else {
                    ColEnd = mid -1;
                }
            }
            return new int[]{-1, -1};
        }





        static int [] searchMatrix( int[][] matrix, int target ){
            int rows = matrix.length;
            int cols= matrix[0].length;     // number of cols on row 0
            // be cautious as matrix may be empty

            if (rows == 1){
                return BinarySearch(matrix, 0, 0, cols-1, target);
            }

            int rStart = 0;
            int rEnd = rows-1;
            int cmid = cols /2;
            // run the loop till two rows are remaining
            while(rStart < rEnd-1){         // while this is true, we will have more than 2 rows
               int rmid = rStart+(rEnd-rStart)/2;

                if(matrix[rmid][cmid] == target){
                    return new int[] {rmid,cmid};
                }
                if(matrix[rmid][cmid] > target){
                     rEnd = rmid;
                } else if (matrix[rmid][cmid] < target){
                    rStart = rmid;
                }
            }
            //now we have two rows

            //check whether the target is in the column of 2 rows

            if (matrix[rStart][cmid] == target){
                return new int[] {rStart, cmid};
            }
            if (matrix[rStart+1][cmid] == target){
                return new int[] {rStart+1, cmid};
            }

            // search in 1st half
            if (target <= matrix[rStart][cmid-1] ) {
                return BinarySearch(matrix, rStart, 0,cmid-1,target);

            }
            // search in 2nd half
            if (target >= matrix[rStart][cmid+1] && target <= matrix[rStart][cols-1]  ) {

                return BinarySearch(matrix, rStart, cmid+1,cols-1,target);
            }
            // search in 3rd half
            if (target <= matrix[rStart+1][cmid-1] ) {

                return BinarySearch(matrix, rStart+1, 0,cmid-1,target);
            }
            // search in 4th half
            else  {
                return BinarySearch(matrix, rStart+1, cmid+1,cols-1,target);
            }
        }

}

package Arrays_Revision;

import java.util.Arrays;

public class sortedMatrix {
    public static void main(String[] args) {

        int [][] mat = {
                {0}
        };

        int target = 0;

        System.out.println(Arrays.toString(search(mat, target)));
    }

    static int[] biSearch (int[][] matrix ,int row, int cStart, int cEnd, int target){

        while(cStart <= cEnd){
            int mid = cStart + (cEnd-cStart)/2;

            if(matrix[row][mid] == target){
                return new int[] {row,mid};
            }  if (matrix[row][mid] < target) {
                cStart = mid+1;
            }else cEnd = mid-1;
        }
        return new int[]{-1,-1};
    }

    static  int[] search (int[][] mat, int target){


        int rows = mat.length;
        int Cols = mat[0].length;

        if(rows == 1){
            //do binary search
            return biSearch(mat,0,0,Cols-1,target);
        }

        int sRow = 0;
        int eRow = rows-1;
        int Cmid = Cols/2;

        while(sRow < (eRow -1)){
            int rMid = sRow + (eRow-sRow)/2;

            if(mat[rMid][Cmid] == target){
                return new int[] {rMid,Cmid};
            } else if (mat[rMid][Cmid] > target) {
                eRow = rMid;
            }else
                sRow = rMid;
        }

        // now we have two rows

        if(mat[sRow][Cmid] == target){
            return new int[] {sRow,Cmid};
        }else if(mat[sRow+1][Cmid] == target){
            return new int[] {sRow+1,Cmid};
        }

        //checking in the last 4 parts

        if(target < mat[sRow][Cmid]){
            return biSearch(mat,sRow,0,Cmid-1,target);
        }
        else if (target > mat[sRow][Cmid] && target <= mat[sRow][Cols-1] ) {
            return biSearch(mat,sRow,Cmid+1,Cols-1,target);
        }
        else if(target < mat[eRow][Cmid]) {
            return biSearch(mat,sRow+1,0,Cmid-1,target);
        }
        else
            return biSearch(mat,sRow+1,Cmid+1,Cols-1,target);

    }

}

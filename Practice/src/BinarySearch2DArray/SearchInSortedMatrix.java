package BinarySearch2DArray;

import java.util.Arrays;

public class SearchInSortedMatrix {
    public static void main(String[] args) {

        int[][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        int[][] matrix2 = {{}};
        int target = 0;
        System.out.println(Arrays.toString( search(matrix2,target)));
    }

    static int[] search ( int[][]mat, int target){
        if(mat.length ==0){
            return new int[]{-1,-1};
        }
        int rows = mat.length;
        int cols = mat[0].length;
//        int sCol = 0;
//        int eCol = cols-1;

        if(rows == 1){
            return binarySearch(mat,0,0,cols-1,target);
        }

        int sRow = 0;
        int eRow = rows-1;
        int cMid = cols/2;

        //to search the middle column
        //here we are eliminating rows
        while(sRow < (eRow-1)){
            int mid = sRow+(eRow-sRow)/2;

            if(target == mat[mid][cMid]){
                return new int[] {mid,cMid};
            }
            if(target < mat[mid][cMid]){
                eRow =mid;
            }else
                sRow=mid;

        }

        //here only two rows are left

        //checking the mid two Columns separately

        if(mat[sRow][cMid]==target){
            return new int[]{sRow,cMid};
        }
        if(mat[sRow+1][cMid]==target){
            return new int[]{sRow+1,cMid};
        }


        //now check in the adjacent sides of each of two remaining rows


        //
        if(target <= mat[sRow][cMid-1]){
            return  binarySearch(mat,sRow,0,cMid-1, target);
        }
        if(target >= mat[sRow][cMid+1]  && target <= mat[sRow][cols-1]){
            return  binarySearch(mat,sRow,cMid+1, cols-1, target);
        }

        if(target <= mat[sRow+1][cMid-1]){
            return  binarySearch(mat,sRow+1,0,cMid-1, target);
        }
        if(target >= mat[sRow+1][cMid+1]){
            return  binarySearch(mat,sRow+1,cMid+1, cols-1, target);
        }
        return new int[] {-1,-1};
    }

    static int[] binarySearch(int[][] arr,int row,int cStart, int cEnd, int target){

        while(cStart<=cEnd){
            int mid = cStart+(cEnd-cStart)/2;

            if(target== arr[row][mid]){
                return new int[] {row,mid};
            }
            if(target < arr[row][mid]){
                cEnd = mid-1;
            }
            else
                cStart = mid+1;
        }
        return new int[] {-1,-1};
    }
}

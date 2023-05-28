package BinarySearch2DArray;
import java.util.Arrays;
public class BinarySearch_2D {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        int target = 14;
        System.out.println(Arrays.toString( search2D(matrix,target)));

    }

    //search in the row provided
    static int[] binarySearch ( int[][] arr, int row, int cStart, int cEnd, int target ){

        while ( cStart <= cEnd){
            int mid = cStart +(cEnd-cStart)/2;

            if(arr[row][mid]==target){
                return new int[]{row,mid};
            }

            if(arr[row][mid] < target){
                cStart = mid+1;
            }else
                cEnd = mid-1;
        }
        return new int[]{-1,-1};
    }

    static int[] search2D (int[][] arr, int target){
        if(arr.length ==0){
            return new int[]{-1,-1};
        }
        int rows = arr.length;
        int cols = arr[0].length;

        if(rows == 1){
            binarySearch(arr,0,0,cols-1,target);
        }

        int rS = 0;
        int rE = rows-1;
        int cMid = cols/2;
        while (rS < (rE - 1)){

            int mid = rS +(rE-rS)/2;
            if(arr[mid][cMid]==target){
                return new  int[] {mid,cMid};
            }
            if(arr[mid][cMid]<target){
                rS = mid ;
            }
            else
                rE =mid;
        }
        //now we have two rows

        if(arr[rS][cMid]==target){
            return new int[]{rS,cMid};
        }
        if(arr[rS+1][cMid]==target){
            return new int[]{rS+1,cMid};
        }

        //check for part1
        if( target <= arr[rS][cMid-1]  ){
           return binarySearch(arr, rS, 0,cMid-1,target);
        }

        //check for part 3
        if( target >= arr[rS][cMid+1] && target <= arr[rS][cols-1]  ){
          return   binarySearch(arr, rS, cMid+1,cols-1,target);
        }

        //check for part 2

        if( target <= arr[rS+1][cMid-1]  ){
           return binarySearch(arr, rS+1, 0,cMid-1,target);
        }

        //check for part 4
        if( target >= arr[rS+1][cMid-1]  ){
           return binarySearch(arr, rS+1, cMid+1,cols-1,target);
        }


        return new int[]{-1,-1};
    }
}

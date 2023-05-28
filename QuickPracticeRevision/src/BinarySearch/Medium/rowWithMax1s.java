package BinarySearch.Medium;

public class rowWithMax1s {
    public static void main(String[] args) {
        int[][]mat = {
                {0, 0, 0 ,1, 1 ,1 ,1, 1, 1},
                {0 ,0, 0, 0 ,1 ,1 ,1 ,1 ,1},
                {0 ,0, 0, 0, 1 ,1 ,1 ,1 ,1}
        };

        int[][] arr = {
                {0, 0, 0},
                {1, 1 ,1},
                {0, 1, 1},
        };

        System.out.println(rowWithMaxOne(mat));
    }

    //optimised O(nLogm)

    static int rowWithMaxOne(int[][] mat){

        int minSoFar = 1000;
        int minIndex = 1000;
        int maxRow = -1;
        int row=0;

        for (int i = 0; i < mat.length; i++) {
            int st = 0;
            int end = mat[i].length-1;
            while (st <= end){
               int mid = st +(end - st)/2;
               if( mid >0  && mat[i][mid] == 1){
                   //check left
                   if(mat[i][mid-1] == 1){
                       end = mid-1;
                   }
                   else {
                       minIndex = mid;
                       row = i;
                       end = mid-1;
                   }
               }else if (mid == 0 && mat[i][mid] == 1){
                   minIndex = mid;
                   row = i;
                   break;
               }
               else st = mid+1;
            }
            if(minSoFar > minIndex){
                minSoFar = minIndex;
                maxRow = row ;
            }
        }
        return maxRow;
    }






    // gives complexity nm
    static int rows (int[][] arr) {
        int minSoFar = 1000;
        int minIndex = 1000;
        int maxRow = -1;
        int row=0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == 1){
                    minIndex = j;
                    row = i;
                    break;
                }
            }
            if(minSoFar > minIndex){
                minSoFar = minIndex;
                maxRow = row ;
            }
        }
        return maxRow;
    }
}

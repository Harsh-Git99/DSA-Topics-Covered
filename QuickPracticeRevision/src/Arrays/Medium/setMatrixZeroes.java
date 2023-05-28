package Arrays.Medium;

import java.util.Arrays;
import java.util.Map;

public class setMatrixZeroes {
    public static void main(String[] args) {
        int[][] matrix = {
                {0,1,2,2},{3,4,5,6},{1,3,1,5}
        };
        setZeroes(matrix);

        for (int[] arr : matrix) {
            System.out.println(Arrays.toString(arr));
        }


    }

    static void setZeroes(int[][] arr){
        //search for the 0 in the array
        int x = 0, y = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == 0){
                    while(x != arr[0].length){
                        arr[i][x] =0;
                        x++;
                    }
                    while(y != arr.length){
                        arr[y][j] =0;
                        y++;
                    }
                    x=0;y=0;
                }
            }
        }

    }
}

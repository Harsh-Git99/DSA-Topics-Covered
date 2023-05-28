package Arrays.Medium;

import java.util.ArrayList;
import java.util.List;

public class spiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},
                    {4,5,6},
                    {7,8,9}
        };

        System.out.println(spiral(matrix));


    }

    static List<Integer> spiral (int[][] mat){
        int row = mat.length;
        int col = mat[0].length;
        int rowStart = 0;
        int rowEnd = mat.length-1;
        int colStart = 0;
        int colEnd = mat[0].length-1;
        List<Integer> list = new ArrayList<>();
        while(rowStart <= rowEnd && colStart <= colEnd){

            for (int i = colStart; i <= colEnd; i++) {
                list.add(mat[rowStart][i]);
            }
            rowStart++;

            for (int i = rowStart; i <= rowEnd; i++) {
                list.add(mat[i][colEnd]);
            }
            colEnd--;
            if(rowStart <= rowEnd){

                for (int i = colEnd; i >=colStart; i--) {
                    list.add(mat[rowEnd][i]);
                }
                rowEnd--;
            }

            if(colStart <= colEnd){
                for (int i = rowEnd; i >= rowStart; i--) {
                    list.add(mat[i][colStart]);
                }
                colStart++;
            }
        }
        System.out.println(list);
        return list;
    }
}

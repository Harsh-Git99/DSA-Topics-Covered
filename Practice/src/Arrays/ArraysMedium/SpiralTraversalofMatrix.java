package Arrays.ArraysMedium;

import java.util.ArrayList;
import java.util.List;

public class SpiralTraversalofMatrix {
    public static void main(String[] args) {

        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println( spiral(mat));
    }

    static List<Integer> spiral(int[][] mat){
        List<Integer> list = new ArrayList<>();
        int rows = mat.length;
        int cols = mat[0].length;
        int top = 0;
        int bottom = rows-1;
        int left = 0;
        int right = cols-1;

        while(top <= bottom && left <= right){
            for (int i = left; i <= right; i++) {
                list.add(mat[top][i]);

            }
            top++;
            for (int i = top; i <= bottom; i++) {
                list.add(mat[i][right]);

            }
            right--;
            if(top<=bottom) {
                for (int i = right; i >= left; i--) {
                    list.add(mat[bottom][i]);

                }
                bottom--;
            }
            if(left<=right) {
                for (int i = bottom; i >= top; i--) {
                    list.add(mat[i][left]);

                }
                left++;
            }

        }
        return list;
        }
}

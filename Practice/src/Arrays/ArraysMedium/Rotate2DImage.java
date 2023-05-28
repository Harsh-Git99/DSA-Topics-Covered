package Arrays.ArraysMedium;

public class Rotate2DImage {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};

       rotateOptimized(mat);



       int[][] ans = rotate(mat);

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(ans[i][j] + " ") ;
            }
            System.out.println();
        }
    }

    //takes zero complexity
    static void rotateOptimized(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols/2; j++) {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][(cols-1)-j];
                matrix[i][(cols-1)-j] = temp;
            }
        }
    }




    //takes more space complexity
    static int[][] rotate(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] ans = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                ans[j][(rows-1)-i] = matrix[i][j];
            }
        }
        return ans;
    }
}

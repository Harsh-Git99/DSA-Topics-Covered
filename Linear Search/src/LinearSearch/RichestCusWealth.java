package LinearSearch;

//LEETCODE PROBLEM

public class RichestCusWealth {
    public static void main(String[] args) {
        int[][] arr2D = {{1,2,3},{3,2,1}};
        int [][] acc = {{1,5},{7,3},{3,5}};
        System.out.println( rich(arr2D));
        System.out.println("second case");
        System.out.println( rich(acc));
    }

    static  int rich( int[][] arr){
        int Max = 0;
        for (int r = 0; r < arr.length; r++) {
            //when you start a new col, we should have new sum.
            int rowSum = 0;
            for (int c = 0; c < arr[r].length ; c++) {
              rowSum = rowSum + arr[r][c] ;
            }
            if (rowSum > Max){
                Max = rowSum;
            }
        }
       return Max;
    }
}

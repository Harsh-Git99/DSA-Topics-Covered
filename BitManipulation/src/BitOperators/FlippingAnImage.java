package BitOperators;

public class FlippingAnImage {
    public static void main(String[] args) {
        int [][] image = {
                {1, 1, 0},
                {1,0,1},
                {0,0,0}
        };


        System.out.println(Flip(image));

    }

    static int[][] Flip(int[][] arr){

        for (int[] row: arr){
            //reverse this array
            for (int col = 0; col < (arr[0].length +1)/2 ; col++){
                //swap
                int temp = row [col] ^1;
                row [col] = row [arr[0].length - col -1] ^1;
                row [arr[0].length - col -1] = temp;
            }
        }
        return arr;
    }
}

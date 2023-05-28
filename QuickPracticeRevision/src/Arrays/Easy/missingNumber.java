package Arrays.Easy;

public class missingNumber {
    public static void main(String[] args) {
        int[]arr = {3,0,1};
        System.out.println(number(arr));
    }

    static  int number (int[] arr){
        int n = arr.length;
        int sum = 0;
        int total = n*(n+1)/2;
        for (int j : arr) {
            sum = sum + j;
        }
        return total - sum;
    }
}

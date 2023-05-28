package Arrays.Medium;

public class KadaneAlgorithm_MaximumSubarraySumArray {
    public static void main(String[] args) {
        int[] arr = {74, -72, 94, -53, -59, -3, -66, 36, -13, 22 ,73 ,15, -52, 75};
        System.out.println(kadane(arr));
    }

    static int kadane(int[] arr){
        int sum = 0;
        int maxSum = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(sum >= 0){
                sum = sum + arr[i];
            }else sum = arr[i];
            if(maxSum < sum){
                maxSum = sum;
            }

        }
        return maxSum;
    }
}

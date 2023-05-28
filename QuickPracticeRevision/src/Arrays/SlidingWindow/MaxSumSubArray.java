package Arrays.SlidingWindow;

public class MaxSumSubArray {
    public static void main(String[] args) {
        int[] arr = {2,5,1,8,2,9,1};
        int k = 3;
        System.out.println(maxSumSliding(arr,k));

    }

    //slidingWindow
    static int maxSumSliding(int[] arr, int k ){
        int i = 0;  //window Start
        int j = 0;  //window end
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        while(j < arr.length-1){        //the
            if((j-i+1) < k){
                sum += arr[j];
                j++;
            }else if ((j-i+1) == k){
                sum += arr[j];
                maxSum = Math.max(maxSum,sum);

                sum -= arr[i];
                j++;
                i++;
            }
        }
        return maxSum;
    }



    static int maxSum(int[] arr, int k ){
        int sum = 0;
        int minSum = Integer.MAX_VALUE;
        int maxSum = Integer.MIN_VALUE;
        System.out.println(arr.length-k);
        for (int i = 0; i <= arr.length-k; i++) {
            for (int j = i; j < k+i; j++) {
                sum += arr[j];
            }
            if(sum < minSum ){
                minSum = sum;
            }
            if(sum > maxSum ){
                maxSum = sum;
            }
            sum=0;
        }
        return maxSum;
    }
}

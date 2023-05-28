package Arrays.ArraysEasy;

public class LongestSubarray {
    public static void main(String[] args) {
        int[] arr = { -1, 2, 3};
        int k = 6;
        System.out.println(lengthSubArray(arr,k));

    }

    static int lengthSubArray(int[] arr, int k){
        int max_Length = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum = sum + arr[j];
                if(sum==k){
                    max_Length = Math.max(j-i+1,max_Length);
                }
            }
        }
        return max_Length;

    }
}

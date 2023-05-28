package Arrays.ArraysMedium;

public class MaximumSubarray_KadanesAlgo {
    public static void main(String[] args) {

        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
    }

    static int maxSubArray(int[] nums) {
        int cSum = 0;
        int oSum = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if(cSum >= 0){
                cSum = cSum +   nums[i] ;
            }else {
                cSum = nums[i];
            }
            if(cSum > oSum){
                oSum = cSum;
            }
        }
        return oSum;
    }
}

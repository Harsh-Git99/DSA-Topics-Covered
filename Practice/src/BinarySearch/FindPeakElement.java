package BinarySearch;

public class FindPeakElement {
    public static void main(String[] args) {

        int [] nums = {1,2};

        System.out.println("index number"+findPeakElement(nums)+"is the peak element");
    }

    static int findPeakElement(int[] nums) {
        int start =0;
        int end = nums.length-1;



        while(start <= end){

            int mid = start + (end-start)/2;

            // if the array length =1, then that same element is the peak ele
            if(nums.length <= 1){
                return 0;
            }

            // here, only 2 elements are left in the array, so we check the greatest b/w the two and return it as peak ele
            if(mid==0){
                if(nums[0] >= nums[1]){
                    return 0;
                }
                return 1;
            }
            // here, only 2 elements are left in the array, so we check the greatest b/w the two and return it as peak ele

            if(mid== nums.length-1){
                if(nums[nums.length-1] >= nums[nums.length-2]){
                    return nums.length-1;
                }
                return nums.length-2;
            }


            if(nums[mid]>nums[mid+1] && nums[mid]>nums[mid-1]){
                return mid;

            }else if(nums[mid]<nums[mid-1]){
                end=mid-1;

            }else if(nums[mid]<nums[mid+1]){
                start=mid+1;
            }
        }
        return start;
    }
}

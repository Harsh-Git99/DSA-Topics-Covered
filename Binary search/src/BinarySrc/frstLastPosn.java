package BinarySrc;

import java.util.Arrays;

public class frstLastPosn {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target= 8;
        int[] ans ={-1,-1};

        ans[0] = search(nums, target, true);//here we have specified in findStartindex that we are searching for start(therefore given true in the argument)
       ans[1] = search(nums, target, false);      //here we have specified in findStartindex that we are NOT searching for start(therefore given FALSE in the argument)



        System.out.println(Arrays.toString(ans));


    }

    static int search (int[] nums, int target, boolean findStartIndex){
        
        int ans =-1;
        
        int start = 0;
        int end = nums.length-1;

        while (start <= end){
            int mid = start + (end -start)/2;
            if (nums[mid] > target){
                end = mid -1;
            } else if (nums[mid] < target) {
                start = mid+1;
            }else {
                //potential ans found
                ans = mid;
                if(findStartIndex== true){          // if looking for start index thn start=mid-1
                    end = mid-1;

                }else {
                    start = mid+1;
                }

            }
        }
        return ans;
    
    }

}

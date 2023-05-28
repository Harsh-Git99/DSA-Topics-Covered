package Arrays.ArraysMedium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int []nums = {0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestConsecutive2(nums));
    }


    //Optimized
     static int longestConsecutive2(int[] nums) {
        int longestStreak = 0;
         HashSet<Integer> set = new HashSet<>();

         for(int num : nums){
             set.add(num);
         }

         for(int num : nums){
             if(!set.contains(num-1)){  //if the num element is the first number of the longestConsecutive set
                 int currentNums = num;
                 int currentStreak = 1;

                 while(set.contains(currentNums+1)){
                     currentNums++;
                     currentStreak++;
                 }
                 longestStreak = Math.max(longestStreak,currentStreak);
             }
         }
         return longestStreak;
     }


    static int longestConsecutive(int[] nums) {
        //sort the array
        int count = 1 , max = 0;
        if(nums.length == 0){
            return 0;
        }
        if(nums.length == 1){
            return 1;
        }
        Arrays.sort(nums);


        System.out.println(Arrays.toString(nums));
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i-1]+1){
                count++;
            }else if( nums[i] != nums[i-1]){
                count=1;
            }
           max = Math.max(max,count);
        }
        return max;
    }
}

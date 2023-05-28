package Arrays.ArraysMedium;

import java.util.Arrays;

public class SortColour {
    public static void main(String[] args) {

        int[] arr = {2,0,2,1,1,0};
       // sortColorsBubble(arr);
        sortColorsInsertion(arr);
       // sortColorsSelection(arr);
      // sortColors(arr);
     //   System.out.println(Arrays.toString(arr));

    }

    //using bubble sort
    static void sortColorsBubble(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length ; j++) {
                if(nums[i] > nums[j]){
                    //swap
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }



    //using SelectionSort
    static void sortColorsSelection(int[] nums) {
        //
        for (int i = 0; i < nums.length; i++) {
            int last = nums.length-i-1;

                int max = Max(nums, 0, last);
                //swap with last
                int temp = nums[max];
                nums[max] = nums[last];
                nums[last] = temp;

        }

        System.out.println(Arrays.toString(nums));

    }

    //finding Max element
    static  int Max (int[] nums, int start, int last) {
        int max = start;

            for (int i = 0; i <= last; i++) {
                if (nums[i] > nums[max]) {
                    max = i;
                }
            }
            return max;
    }



    //using InsertionSort
    static void sortColorsInsertion(int[] nums) {

        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j >0 ; j--) {
                if(nums[j] > nums[j-1]){
                    break;
                }else {
                    int temp = nums[j-1];
                    nums[j-1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }


    //using Arrays.sort
    static void sortColors(int[] nums) {

        Arrays.sort(nums);
    }
}

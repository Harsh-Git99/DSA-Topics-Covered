package BinarySearch;

public class DuplicateRotatedBS {
    public static void main(String[] args) {

        int[] arr = {1,1,3};
        int target=0;
        System.out.println(search(arr, target));


    }

     static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            // Check if left side is sorted
            if (nums[start] < nums[mid]) {
                // Check if target is in left side
                if (target >= nums[start] && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            // Check if right side is sorted
            else if (nums[start] > nums[mid]) {
                // Check if target is in right side
                if (target > nums[mid] && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            // If left side is not sorted or right side is not sorted
            // duplicate elements can exist.
            else {
                start++;
            }
        }
        return -1;
    }
}
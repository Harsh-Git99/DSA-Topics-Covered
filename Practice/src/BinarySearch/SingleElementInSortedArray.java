package BinarySearch;

public class SingleElementInSortedArray {
    public static void main(String[] args) {

        int[] arr ={1,1,2,3,3,4,4,8,8};
        System.out.println(single(arr));

        System.out.println(singleNonDuplicate(arr));
    }

    static int single(int[] arr){
        int xor =0;
        for (int val:arr) {
            xor=xor^val;
        }
        return xor;
    }
    static int singleNonDuplicate(int[] nums) {
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(mid<nums.length-1 && nums[mid]==nums[mid+1]){
                if(mid%2==0)
                    left=mid+1;
                else
                    right=mid-1;
            }else if(mid-1>=0 && nums[mid]==nums[mid-1]){
                if(mid%2==0)
                    right=mid-1;
                else
                    left=mid+1;
            }
            else
                return nums[mid];
        }
        return 0;
    }
}

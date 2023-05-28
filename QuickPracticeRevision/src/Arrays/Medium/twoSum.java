package Arrays.Medium;

import java.util.Arrays;
import java.util.HashMap;

public class twoSum {
    public static void main(String[] args) {
        int [] arr = {2,7,11,15};
        int target = 9;

        System.out.println(Arrays.toString(findIndices(arr,target)));
    }

    static int[] findIndices(int[] arr, int target){
        HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
        int[] ans = new int[2];
//        for (int i = 0; i < arr.length; i++) {
//            map.put(arr[i],i);
//        }

        for (int i = 0; i < 2*(arr.length); i++) {
            if(map.containsKey(target - arr[i])){
                ans[0] = i;
                ans[1] = map.get(target-arr[i]);
                return ans;
            }
            map.put(arr[i],i);
        }
        return new int[]{-1,-1};
    }


}
